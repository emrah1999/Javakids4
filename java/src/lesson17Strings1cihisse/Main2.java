package lesson17Strings1cihisse;

public class Main2 {
    public static void main(String[] args) {
        String s="Salam                      ";
        System.out.println(s.length());
        String s1="Salam";
        String s2="Necesen";
        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(s2));

        char[] chars={'h','e','l','l','o'};
        String s3=String.copyValueOf(chars);
        System.out.println(s3);
        String s4=String.copyValueOf(chars,1,3);
        System.out.println(s4);

        String s5="Hello World";
        System.out.println(s5.charAt(4));
    }
}
