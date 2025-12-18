package lesson17Strings1cihisse;

public class Main {
    public static void main(String[] args) {
        Class1 class1=new Class1();
        Class1 class2=new Class1();
        if(class1==class2){
            System.out.println("beraberdir");
        } else {
            System.out.println("beraber deyil");
        }

        String s=new String("Salam");
        String s2=new String("Salam");
        if(s==s2){
            System.out.println("beraberdir");
        }else {
            System.out.println("beraber deyil");
        }

        String s4="Salam";
        String s3="Salam";
        if (s4==s3){
            System.out.println("beraberdir");
        } else {
            System.out.println("beraber deyil");
        }
    }
}
