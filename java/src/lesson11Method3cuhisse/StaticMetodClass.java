package lesson11Method3cuhisse;

public class StaticMetodClass {
    static int age;
    static {
        System.out.println("Static block executed.");
    }
    static int objCount;


    {
        objCount++;
        System.out.println("Instance block executed.");
    }
}
