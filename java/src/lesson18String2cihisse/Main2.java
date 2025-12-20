package lesson18String2cihisse;

public class Main2 {
    public static void main(String[] args) {
        String s="Men java dili oyrenirem";
        if(s.contains("fff")){
            System.out.println("Cumlede java sozu var");
        }else{
            System.out.println("Cumlede java sozu yoxdur");
        }

        String s1="   Salam     ";
        System.out.println(s1);
        System.out.println(s1.trim());
        System.out.println(s1.length());
        System.out.println(s1.trim().length());
    }
}
