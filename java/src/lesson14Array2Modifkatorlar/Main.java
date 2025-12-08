package lesson14Array2Modifkatorlar;

public class Main {
    public static void main(String[] args) {
        int[] numbers={12,33,4,32,3};

        int[] number2=new int[10];

        for (int n:numbers){
            System.out.println(n);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        char[] chars={'a','b','c'};

        Person[] persons={new Person("Ali",25),new Person("Veli",30)};

        boolean[] f= {true,false,true};
    }
}
