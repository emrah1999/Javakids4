package lesson4TypeChanges;

public class Main {
    public static void main(String[] args) {
        int a=10;
        long b=a;
        byte m=23;
        short n=m;
        System.out.println(b);
        System.out.println(n);

        long x=4_000_000_000L;
        byte c=(byte)b;
        int v=(int)x;
        System.out.println(c);
        System.out.println(v);
    }
}
