package lesson5operatorlar;

public class MainIf2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        if (!(a < b && a!=0 && b!=0)) {
            System.out.println(b+" boyukdur");
        }
        System.out.println(a<b);


        String result=(a>b)?"A boyukdur":"B boyukdur";
        System.out.println(result);

    }
}
