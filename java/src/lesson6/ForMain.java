package lesson6;

public class ForMain {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        int a=100;

        for (int i = 100; i > 50; i--) {
            if(i%2==0){
                System.out.println(i+" cutdur");
                a++;
            }
            a--;
            int b=50;

        }
        System.out.println(a);

    }
}
