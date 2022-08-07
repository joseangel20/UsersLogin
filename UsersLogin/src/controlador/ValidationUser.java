package controlador;
import vista.FrmLogin;

public class ValidationUser {
    FrmLogin frmLogin;
    
    public static Boolean user(String user) {
        if (user.length() > 0) {
            if (user.toLowerCase().equals("jose")) {
                return true;
            }
        }

        return false;
    }

    public static Boolean password(String password) {
        System.out.print(password + " ");
        
        if (password.length() > 0) {
            if (password.toLowerCase().equals("123456")) {
                return true;
            }
        }
        
        return false;
    }
    
}
