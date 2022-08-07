package controlador;

public abstract class Person{

protected String name, surname, telephone, email, password;

    public Person(String name, String surname, String telephone,
            String email, String password) {

        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
    }
    
    abstract void showDatos();
}
