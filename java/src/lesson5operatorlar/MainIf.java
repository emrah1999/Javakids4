package lesson5operatorlar;

public class MainIf {
    public static void main(String[] args) {
        int a=7;
        int b=3;
        if(a==b){
            System.out.println("Beraberdir");
        }else{
            System.out.println("Beraber deyil");
        }

        if(b!=0){
            System.out.println(a/b);
        }else{
            System.out.println("Sifira bolme olmaz");
        }
        double d=(double)a/b;
        System.out.println(d);
    }
}
