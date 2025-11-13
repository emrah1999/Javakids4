package lesson7Practise;

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            if(i%3==0){
                System.out.println(i);

            }
        }

        int a=59;
        boolean isPrime=true;
        for (int i = 2; i < a; i++) {
           if(a%i==0){
               isPrime=false;
               System.out.println(a+ "  murekkeb ededdir");
               break;
           }
        }
        if (isPrime){
            System.out.println(a+"  saded ededdir");
        }
    }
}
