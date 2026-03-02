package lesson37CollectionPractika;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZooPark zooPark =new ZooPark();

        ArrayList<Animal> lions=new ArrayList<>();
        ArrayList<Animal> elephant=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            lions.add(new Lion("Lion"+i));
        }
        for (int i = 0; i < 50; i++) {
            elephant.add(new Elephant("Elphant"+i));
        }
        System.out.println(lions.size());
        System.out.println(elephant.size());

        zooPark.addAnimal(lions);
        zooPark.addAnimal(elephant);

        System.out.println(zooPark.animals.size());

        zooPark.removeList(20,1);
        zooPark.removeList(20,2);

        System.out.println(zooPark.animals.size());


    }
}
