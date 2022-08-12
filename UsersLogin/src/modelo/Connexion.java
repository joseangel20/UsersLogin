package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
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

    public static ArrayList<User> read() {
        ArrayList<User> lista = new ArrayList<>();

        try {

            Connexion con = Connexion.getInstance();
            PreparedStatement ps
                    = con.connect().prepareStatement("SELECT * FROM consulta");
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

    public static boolean insertDatos(User user) {

        try {

            Connexion con = Connexion.getInstance();
            PreparedStatement ps
                    = con.connect().prepareStatement("INSERT INTO `users`"
                            + "(`nameUser`, `NAME`, `surname`, `telephone`, "
                            + "`email`, `clave`) VALUES (?,?,?,?,?,?)");
            
            ps.setString(1, user.getUser());
            ps.setString(2, user.getName());
            ps.setString(3, user.getSurname());
            ps.setString(4, user.getTelephone());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getPassword());
            ps.execute();
            con.disconnect();
            ps.close();
            ps = null;

            con.disconnect();
            
            return true;

        } catch (SQLException ex) {
            System.out.println("Datos no insertados.");
        }

        return false;
    }

}
