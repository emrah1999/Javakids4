package lesson18String2cihisse;

public class Main4 {
    public static void main(String[] args) {
        String s="Nuray";
        String s1=s.toLowerCase();
        System.out.println(s);
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder();
//        String s3="";
        for (int i = 0; i < 100; i++) {
           s2.append(s);
//           s+="Nuray";
        }
        System.out.println(s2);

        StringBuilder s5=new StringBuilder("Sevin");
        System.out.println(s5.reverse());


        String ff="Arif";
        String f=ff.toUpperCase();
        System.out.println(ff);
        System.out.println(f);

        StringBuilder se=new StringBuilder("Deniz");
        se.reverse();
        System.out.println(se);

    }
}
