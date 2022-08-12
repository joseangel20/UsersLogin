package modelo;

public class FactoryUser implements IFactoryPerson {

    @Override
    public User user(String user, String name, String surname, String telephone,
            String email, String password) {
        return new User(user, name, surname, telephone, email, password);
    }
    @Override
    public User user(int idUser, String user, String name, String surname, String telephone,
            String email, String password) {
        return new User(idUser,user, name, surname, telephone, email, password);
    }
}
