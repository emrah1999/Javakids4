package lesson37CollectionPractika;

import java.util.Iterator;
import java.util.List;

public class ZooPark {
    List<Animal> animals = new java.util.ArrayList<>();

    public void addAnimal(List<Animal> list){
        animals.addAll(list);
    }

    public void removeList(int count,int type){
        int elephant = 0;
        int lion=0;
        Iterator<Animal> animalIterator = this.animals.iterator();
        while (animalIterator.hasNext()) {
            Animal animal= animalIterator.next();
            if(type==1) {
                if (animal instanceof Lion && lion < count) {
                    animalIterator.remove();
                    lion++;
                }
            }else{
                if (animal instanceof Elephant && elephant < count) {
                    animalIterator.remove();
                    elephant++;
                }
            }
        }
    }
}
