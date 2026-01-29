package lesson28Exception2;

public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) throws IllegalArgumentException {
        if(age<18){
            throw new IllegalArgumentException("Yash 18den kicik ola bilmez");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

