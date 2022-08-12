package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Connexion;
import static modelo.Connexion.read;
import modelo.User;
import vista.FrmLogin;

public final class ValidationUser {

    FrmLogin frmLogin;

    public static Boolean user(String user) {
        if (user.length() > 0) {
            for (int i = 0; i < read().size(); i++) {
                if (user.toLowerCase().equals(read().get(i).getUser())) {
                    return true;
                }
            }
        }

        return false;
    }

    public static Boolean password(String password) {

        if (password.length() > 0) {
            for (int i = 0; i < read().size(); i++) {
                if (password.toLowerCase().equals(read().get(i).getPassword())) {
                    return true;
                }
            }
        }
        return false;
    }

}
