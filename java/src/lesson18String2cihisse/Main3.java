package lesson18String2cihisse;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        String s="Salam menim adim %s. Menim %d yashim var. Men %s seherinde yashairam";

        String name="Nihat";
        int age=14;
        String city="Baki";

        String result=String.format(s,name,age,city);
        System.out.println(result);


        String s1="Men \t komputerimin modeli \"Asus\"-dur";

        String s3="Salam \\ necesen?";
        System.out.println(s3);
        System.out.println(s1);

        String s4="Menim adim \n  ELmandi";
        System.out.println(s4);

        float sf=34.35334234234f;
        System.out.println(String.format("%.3f",sf));

        Random random=new Random();
        int r=random.nextInt(200);
        long l=random.nextLong(2444444444L);
        System.out.println(l);
        System.out.println(r);
    }
}
