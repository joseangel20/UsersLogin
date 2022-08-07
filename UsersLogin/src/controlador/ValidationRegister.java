package controlador;

public final class ValidationRegister {

    public static boolean validateUser(String user) {
        return user.length() > 0;
    }

    public static boolean validateName(String name) {
        return name.length() > 0;
    }

    public static boolean validateSurname(String surname) {
        return surname.length() > 0;
    }

    public static boolean validateTelephone(String telephone) {
        return telephone.length() > 0;
    }

    public static boolean validateEmail(String email) {
        return email.length() > 0;
    }

    public static boolean validatePassword(String password) {
        return password.length() > 0;
    }
    
    public static boolean validateConfirmPassword(String confirmPassword) {
        return confirmPassword.length() > 0;
    }
}
