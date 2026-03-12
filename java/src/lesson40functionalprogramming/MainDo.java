package lesson40functionalprogramming;

public class MainDo {
    public static void main(String[] args) {


        doSomething(()-> System.out.println("do it"));

        doSomething2(s->System.out.println("dp it"+s));



    }

    public static void doSomething(Doable doable){
        doable.doIt();
    }

    public static void doSomething2(Doable2 doable){
        doable.doIt2("Salam");
    }


}
