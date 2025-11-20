package lesson8Class;

public class Main {
    public static void main(String[] args) {
        int a=45673;
        int cem=0; //6
        int ters=0; //37654
        while (a>0){
            int qaliq=a%10; //5
            if(qaliq%2==0){
                cem+=qaliq;
            }
            ters=ters*10+qaliq;
            a/=10; //45
        }
        System.out.println("Cut eded cemi "+cem);
        System.out.println("Ededin tersi yekun "+ters);

    }
}
