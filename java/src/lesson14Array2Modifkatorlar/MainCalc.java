package lesson14Array2Modifkatorlar;

import java.util.Arrays;

public class MainCalc {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.sum(2,4);
        calculator.sum(3,6,7);
        calculator.sum(4,6,7,3);
        calculator.sum(3,4,6,3,4,73);
        calculator.sum(3,4,6);
        calculator.sum(3,5,3,3,5,34,3,4,4,6,3,4,73);
        calculator.sum(3,4,6,3,4,7,3,5,33);
        calculator.metod2("sdd","Sdd");
        calculator.metod2("sdd","Sdd");
        calculator.metod2("sdd","3423","Sdd");
        calculator.metod2("sdd","Sdd","sdsfd","Sdfsd");

        int[] array={34,56,343,4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
