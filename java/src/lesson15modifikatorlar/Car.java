package lesson15modifikatorlar;

public class Car {
    String a;
    public final int b=5;
    public final static int c=9;

    public void start(){
        int speed=10;
    }
    public static void adiMetod(){

    }
    public void aVoid(){
        this.a="sd";
        this.start();
    }
    private Car(){
        System.out.println("Private Constructor");
    }
    public Car(String a){
//        this();
        this(44);
    }
    public Car(int speed){

    }
}
