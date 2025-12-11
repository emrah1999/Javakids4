package lesson15modifikatorlar;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(30));
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
            // 5* 24
            // 4* 6
            // 3* 2
            // 2* 1

        }
    }
}
