package lesson12;

public class CalculationSalary {
    public void calculation(Worker worker){
        if(worker.age<23){
            worker.salary=700;
        }else if(worker.age>=23 && worker.age<30){
            worker.salary=1400;
        }else{
            worker.salary=2000;
        }
    }
}
