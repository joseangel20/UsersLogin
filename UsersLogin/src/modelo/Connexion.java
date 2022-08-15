package modelo;

import java.sql.*;
import java.util.ArrayList;

public final class Connexion {

    private final String bd = "usuario";
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String user = "root";
    private final String password = "";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection connection;
    private static Connexion CONNEXION = null;

    public Connexion() {
    }

    private static synchronized void createInstance() {
        if (CONNEXION == null) {
            CONNEXION = new Connexion();
        }
    }

    public static final Connexion getInstance() {
        if (CONNEXION == null) {
            createInstance();
            CONNEXION = new Connexion();
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

    public static boolean create(User user) {

        try {

            Connexion con = Connexion.getInstance();

            CallableStatement cs
                    = con.connect().prepareCall("{CALL introducirDatos(?,?,?,?,?,?)}");

            cs.setString(1, user.getUser());
            cs.setString(2, user.getName());
            cs.setString(3, user.getSurname());
            cs.setString(4, user.getTelephone());
            cs.setString(5, user.getEmail());
            cs.setString(6, user.getPassword());
            cs.execute();
            con.disconnect();
            cs.close();
            cs = null;

            con.disconnect();

            return true;

        } catch (SQLException ex) {
            System.out.println("Datos no insertados.");
        }

        return false;
    }

    public static ArrayList<User> read() {
        ArrayList<User> lista = new ArrayList<>();

        try {

            Connexion con = Connexion.getInstance();
            PreparedStatement ps
                    = con.connect().prepareStatement("SELECT * FROM users");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(
                        new User(rs.getInt("IDUser"), rs.getString("nameUser"),
                                rs.getString("name"),
                                rs.getString("surname"), rs.getString("telephone"),
                                rs.getString("email"), rs.getString("clave")));
            }
            ps = null;

            con.disconnect();

        } catch (SQLException ex) {
            System.out.println("No se pudo leer los datos.");
        }

        return lista;
    }

    public static void update(User user) {

        try {

            Connexion con = Connexion.getInstance();
            CallableStatement cs = con.connect().
                    prepareCall("{CALL actualizar(?,?,?,?,?,?,?)}");

            cs.setInt(1, user.getIdUser());
            cs.setString(2, user.getUser());
            cs.setString(3, user.getName());
            cs.setString(4, user.getSurname());
            cs.setString(5, user.getTelephone());
            cs.setString(6, user.getEmail());
            cs.setString(7, user.getPassword());

            cs.execute();
            con.disconnect();
            cs.close();

        } catch (SQLException ex) {
            System.out.println("Datos no actualizado.");
        }
    }

    public static void delete(int idUser) {
        try {

            Connexion con = Connexion.getInstance();
            PreparedStatement ps = con.connect().
                    prepareStatement("delete from users where idUser = ?");

            ps.setInt(1, idUser);
            ps.execute();
            con.disconnect();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Datos no eliminado.");
        }
    }
}
