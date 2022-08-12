package modelo;

public interface IFactoryPerson {
    User user(String user, String name, String surname, String telephone, 
            String email, String password);
    User user(int idUser, String user, String name, String surname, String telephone, 
            String email, String password);
}
