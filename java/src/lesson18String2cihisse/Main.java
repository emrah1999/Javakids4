package lesson18String2cihisse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s="Java programming language";
        String[] ars=s.split("a");
        System.out.println(Arrays.toString(ars));

        String s1=s.substring(2,15);
        System.out.println(s1);

        String s2="Arif";
        String s3="ELMAN";
        System.out.println(s2.toUpperCase());
        System.out.println(s3.toLowerCase());

    }
}
