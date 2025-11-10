package lesson6;

public class LoopMain {
    public static void main(String[] args) {
        int a=1;
        while(a<10){
            System.out.println("Hello World");
            a++;
        }

        int sum=0;
        int eded=342342;
        while(eded>0){ //4
            int qaliq=eded%10;
            sum+=qaliq; //16
            eded/=10;
        }
        System.out.println("Reqemlerin cemi: "+sum);
        int b=10;
        do{
            System.out.println("Salam Do While");
            b-=2;
        }while (b>5);
    }
}
