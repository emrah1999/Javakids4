package lesson17Strings1cihisse;

public class Main3 {
    public static void main(String[] args) {
        String s="Men java dili oyrenirem";
        if(s.endsWith("oyrenirem")){
            System.out.println("duzdur");
        } else {
            System.out.println("sehvdir");
        }

        if(s.startsWith("Men")){
            System.out.println("duzdur");
        } else {
            System.out.println("sehvdir");
        }

        String s1="World";
        String s2=new String("WORLD");
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("beraberdir");
        } else {
            System.out.println("beraber deyil");
        }

        String s3="Nihat";
        char[] chars={'T','e','y','m','u','r'};
        s3.getChars(1,3,chars,0);
        System.out.println(chars);


    }
}
