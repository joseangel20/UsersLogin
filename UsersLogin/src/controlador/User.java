package controlador;

public class User extends Person {

    private String user;

    public User(String user, String name, String surname, String telephone,
            String email, String password) {
        super(name, surname, telephone, email, password);

    }

    @Override
    public void showDatos() {
        System.out.printf("Usuario: %s, name: %s, surname: %s, telephone: %s"
                + " email: %s", user, name, surname, telephone, email);
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
