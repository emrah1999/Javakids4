package lesson24OOP5cihisse;

public class Main4 {
    public static void main(String[] args) {
        MainClass mainClass=new MainClass();
        MainClass.InnerClass innerClass=mainClass.new InnerClass();
        innerClass.a=15;
    }
}
