package controlador;

import static modelo.Connexion.read;

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

        return true;
    }

    public static Boolean password(String password) {

        if (password.length() > 0) {
            for (int i = 0; i < read().size(); i++) {
                if (password.toLowerCase().equals(read().get(i).getPassword())) {
                    return true;
                }
            }
        }
        return true;
    }

}
