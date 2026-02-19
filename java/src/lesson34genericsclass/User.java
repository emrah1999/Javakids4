package lesson34genericsclass;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
