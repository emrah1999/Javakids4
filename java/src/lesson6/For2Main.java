package lesson6;

public class For2Main {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            if(i%9==0){
                System.out.println(i+" 9-a bolunur");
                break;
            }
        }

        for (int i = 1; i < 20; i++) {
            System.out.println("Salam "+i);
            if(i%8==0){
                continue;
            }
            System.out.println("Hello"+i);

        }
    }
}
