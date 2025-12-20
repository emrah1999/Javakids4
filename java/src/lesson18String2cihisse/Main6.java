package lesson18String2cihisse;

public class Main6 {
    public static void main(String[] args) {
        int a=5;
        Integer b=5;

        Integer c=a; // autoboxing
        int d=b;   //   unboxing

        String s1="5";
        Integer cg=Integer.parseInt(s1);
        System.out.println(++c);

        Integer x=128;
        Integer y=128;
        System.out.println(x==y); // true // integer cache(-128 127)
        System.out.println(x.equals(y));
    }
}
