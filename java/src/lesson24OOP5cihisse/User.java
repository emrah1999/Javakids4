package lesson24OOP5cihisse;

import java.util.Objects;

public class User implements Cloneable{
    String name;

    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof User){
            User user=(User) obj;
            if(user.name.equals(this.name) && user.surname.equals(this.surname)) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,surname);
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("User obyekti silinir : "+this.name+" "+this.surname);
    }
    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
