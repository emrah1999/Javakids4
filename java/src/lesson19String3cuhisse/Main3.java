package lesson19String3cuhisse;

public class Main3 {
    public static void main(String[] args) {
        Coffee coffee=new Coffee("Americao",Size.EXTRA_LARGE);
        Coffee coffee1=new Coffee("Latte",Size.MEDIUM);
        System.out.println(coffee.name+" - "+coffee.size.getDescription());

        System.out.println(WeekDay.MONDAY.getDescription());

    }
}
