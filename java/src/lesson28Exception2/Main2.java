package lesson28Exception2;

public class Main2 {
    public static void main(String[] args) {
        Hesabla hesabla=new Hesabla();
        try {
            hesabla.divide(10,0);
        }catch (ArithmeticException ex){
            System.out.println("Xeta bas verdi: "+ex.getMessage());
        }



        User user=new User();
        user.setName("Ali");
        try {
            user.setAge(24);
            System.out.println("user name: "+user.getName()+" age "+user.getAge());
        }catch (IllegalArgumentException ex){
            System.out.println("Xeta bas verdi: "+ex.getMessage());
        }


    }
}
