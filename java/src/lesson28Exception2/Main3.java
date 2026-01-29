package lesson28Exception2;

public class Main3 {
    public static void main(String[] args) {
        metod2();
    }
    public static void metod2(){
        metod3();
    }
    public static void metod3(){
        metod4();
    }
    public static void metod4(){
        try {
            System.out.println(5/0);
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }

    }
}
