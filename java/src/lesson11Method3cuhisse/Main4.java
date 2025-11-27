package lesson11Method3cuhisse;

public class Main4 {
    public static void main(String[] args) {
        StaticMetodClass.age=20;
        StaticMetodClass smc = new StaticMetodClass();
        StaticMetodClass smc2 = new StaticMetodClass();
        StaticMetodClass smc3 = new StaticMetodClass();
        StaticMetodClass.age=30;

        System.out.println(StaticMetodClass.objCount);


    }
}
