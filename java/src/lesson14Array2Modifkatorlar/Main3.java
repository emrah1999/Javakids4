package lesson14Array2Modifkatorlar;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers={22,3,5,2,6,2,32,24,59,11,29};
        for (int num:numbers){
            if(checkPrime(num)){
                System.out.println(num+" eded sadedir");
            }
        }

        System.out.println("-------------------");
        char a='M';
        System.out.println(++a);
    }
    public static boolean  checkPrime(int a){
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
