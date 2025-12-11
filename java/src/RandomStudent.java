import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStudent {
    public static void main(String[] args) {
        List<String> students=new ArrayList<>();
        students.add("Elman");
        students.add("Nuray");
        students.add("Nihat");
        students.add("Jasmin");
        students.add("Sevin");
        students.add("Ibrahim");
        students.add("Deniz");
        students.add("Arif");
        students.add("Teymur");
        Random random = new Random();
        System.out.println(students.get(random.nextInt(0, students.size())));
    }
}
