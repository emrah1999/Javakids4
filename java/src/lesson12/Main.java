package lesson12;

import lesson11Method3cuhisse.Calc;

public class Main {
    public static void main(String[] args) {
        Worker worker1=new Worker("Ivan","Ivanov",22);
        Worker worker2=new Worker("Petr","Petrov",25);
        Worker worker3=new Worker("Arif","Arifov",35);

        CalculationSalary calculationSalary=new CalculationSalary();
        calculationSalary.calculation(worker1);
        calculationSalary.calculation(worker2);
        calculationSalary.calculation(worker3);

        worker1.info();
        worker2.info();
        worker3.info();

    }
}
