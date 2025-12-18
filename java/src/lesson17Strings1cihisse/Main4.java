package lesson17Strings1cihisse;

public class Main4 {
    public static void main(String[] args) {
        String s="Men java dili oyrenmeyi sevirem";
        System.out.println(s.indexOf("ja",10));
        int a=s.indexOf("j",2,10);
        System.out.println(a);
        System.out.println(s.lastIndexOf("e"));

        int index=-1;
        do{
            index=s.indexOf("e",index+1);//1
            if (index == -1) {
                break;
            }
            System.out.println("e herfinin yeri: "+index);
        }while (true);
    }
}
