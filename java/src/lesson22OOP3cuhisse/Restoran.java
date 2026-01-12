package lesson22OOP3cuhisse;

public class Restoran {
    public void eat(Eatable animal,String food){
        if(animal instanceof  Cat){
            System.out.println("Cat restoran girdi");
        }
        animal.eat(food);
    }


}
