package lesson17Strings1cihisse;

public class Main6 {
    public static void main(String[] args) {
        String s=" ";
        String s2="";
        System.out.println(s.isBlank());
        System.out.println(s2.isBlank());

        System.out.println(s.isEmpty());
        System.out.println(s2.isEmpty());

        String s3="Akif necesen";
        String s4=s3.replace("Akif","Deniz");
        System.out.println(s3);
        System.out.println(s4);

        String s5=s3.replace("e","a");
        System.out.println(s5);
    }
}
