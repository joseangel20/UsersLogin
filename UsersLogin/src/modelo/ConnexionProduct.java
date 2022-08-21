package modelo;

import modelo.product.Product;

import java.sql.*;
import java.util.ArrayList;

public final class ConnexionProduct {

    private final String bd = "usuario";
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String user = "root";
    private final String password = "";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection connection;
    private static ConnexionProduct CONNEXION = null;

    public ConnexionProduct() {
    }

    private static synchronized void createInstance() {
        if (CONNEXION == null) {
            CONNEXION = new ConnexionProduct();
        }
    }

    public static final ConnexionProduct getInstance() {
        if (CONNEXION == null) {
            createInstance();
            CONNEXION = new ConnexionProduct();
        }

        return CONNEXION;
    }

    public Connection connect() {

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url + bd, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Conexion no establecida");
        }

        return connection;
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Conexion no pudo cerrarse correctamente.");
        }
    }

    public static boolean create(Product product) {

        try {

            ConnexionProduct con = ConnexionProduct.getInstance();

            CallableStatement cs
                    = con.connect().prepareCall("{CALL introducirProducto(?,?,?,?,?)}");

            cs.setString(1, product.getName());
            cs.setString(2, product.getMark());
            cs.setString(3, product.getCategory());
            cs.setFloat(4, product.getPrice());
            cs.setInt(5, product.getStock());

            cs.execute();
            cs.close();    
            con.disconnect();

            return true;

        } catch (SQLException ex) {
            System.out.println("Datos no insertados.");
        }

        return false;
    }

    public static ArrayList<Product> read() {
        ArrayList<Product> lista = new ArrayList<>();

        try {

            ConnexionProduct con = ConnexionProduct.getInstance();
            PreparedStatement ps
                    = con.connect().prepareStatement("SELECT * FROM productos");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Product(rs.getInt("idProducto"), rs.getString("nombreProducto"),
                                rs.getString("marcaProducto"), rs.getString("categoria"),
                                rs.getFloat("precioProducto"), rs.getInt("stockProduct")));
            }
            
            con.disconnect();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("No se pudo leer los datos.");
        }

        return lista;
    }

    public static void update(Product product) {

        try {

            ConnexionProduct con = ConnexionProduct.getInstance();
            CallableStatement cs = con.connect().
                    prepareCall("{CALL actualizar(?,?,?,?,?,?,?)}");

            cs.setString(1, product.getName());
            cs.setString(2, product.getMark());
            cs.setString(3, product.getCategory());
            cs.setString(4, String.valueOf(product.getPrice()));

            cs.execute();
            con.disconnect();
            cs.close();

        } catch (SQLException ex) {
            System.out.println("Datos no actualizado.");
        }
    }

    public static void delete(int idProduct) {
        try {

            ConnexionProduct con = ConnexionProduct.getInstance();
            PreparedStatement ps = con.connect().
                    prepareStatement("delete from users where idUser = ?");

            ps.setInt(1, idProduct);
            ps.execute();
            con.disconnect();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Datos no eliminado.");
        }
    }
}
