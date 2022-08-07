package controlador;

public interface IFactoryPerson {
    User user(String user, String name, String surname, String telephone, 
            String email, String password);
}
