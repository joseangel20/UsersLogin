package modelo.user;

public class User extends Person {

    private int idUser;
    private String user;

    public User(int idUser, String user, String name, String surname, String telephone,
            String email, String password) {
        super(name, surname, telephone, email, password);
        this.idUser = idUser;
        this.user = user;
    }

    User(String user, String name, String surname, String telephone, String email, String password) {
        super(name, surname, telephone, email, password);
        this.user = user;
    }

    @Override
    public void showDatos() {
        System.out.printf("IDUser: %s, nameUser %s, name: %s, surname: %s, telephone: %s"
                + " email: %s", idUser, user, name, surname, telephone, email);
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    
}
