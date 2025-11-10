package lesson6;

public class Main {
    public static void main(String[] args) {
        int a = 40;
        if (a % 2 == 0) {
            System.out.println(a + " cutdur");
        } else {
            System.out.println(a + " tekdir");
        }

        int x = 50;
        int y = 60;
        if (x > y) {
            System.out.println(x + "  boyukdur " + y + "-den");
        } else if (x < y) {
            System.out.println(y + "  boyukdur " + x + "-den");
        } else {
            System.out.println(x + " ve " + y + " beraberdir");
        }

        int b = 45, c = 70, d = 25;
        if (b < c && b > d) {
            System.out.println(b + " ortadadir");
        } else if (c < b && c > d) {
            System.out.println(c + " ortadadir");
        }
        else  if(d<b && d>c){
            System.out.println(d+" ortadadir");
        }

        int m=4,n=5;
        int s=m+n;
        m+=3;

    }
}
