package lesson17Strings1cihisse;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        String pattern="[a-zA-Z0-9]{5}";
        String s="sS5Sd";
        if(s.matches(pattern)){
            System.out.println("Uygundur");
        }else {
            System.out.println("Uygun deyil");
        }

        String s2="Hello World";
        char[] chars=s2.toCharArray();
        System.out.println(Arrays.toString(chars));

        //Akif Arif

        String s3="f";
        String s4="r";
        String s5="I";
        String s6="i";
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareToIgnoreCase(s5));
        System.out.println(s5.compareTo(s4));
        System.out.println(s5.compareTo(s6));


    }
}
