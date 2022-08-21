package modelo.user;

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

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
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
    
    abstract void showDatos();
}
