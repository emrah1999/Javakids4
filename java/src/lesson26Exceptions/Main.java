package lesson26Exceptions;


public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int[] arr = {1, 2, 3};

//
        try {
            System.out.println(a / b);
            try {
                User user = new User();
                System.out.println(user.name);
            } catch (NullPointerException e) {
                System.out.println("Null istifade etmek olmaz");
            }
            System.out.println(arr[2]);
        } catch (ArithmeticException e) {
            System.out.println("Sifira bolmek olmaz");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Olmayan indexe muraciet etdin ");
        } finally {
            System.out.println("Ister exception olsun ister olmasin bu blok her zaman isleyir");
        }
    }
}
