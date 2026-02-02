package lesson29;

public class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        if(name.length()<2) {
            throw new ValidateException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.length()<3) {
            throw new ValidateException("Surname cannot be null or empty");
        }
        this.surname = surname;
    }
}
