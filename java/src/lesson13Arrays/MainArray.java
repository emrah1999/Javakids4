package lesson13Arrays;

public class MainArray {
    public static void main(String[] args) {
        int[] numbers=new int[3];
        String[] words=new String[4];
        double[] decimals=new double[6];
        Car[] cars=new Car[4];
        cars[0]=new Car();
        cars[1]=new Car();
        cars[2]=new Car("Akif");

        numbers[0]=2;
        numbers[1]=677;
        numbers[2]=45;

        int[] number2;


        System.out.println("-------------------");

        int[] arrays=new int[]{2,4,5,67,3,56,2,5,3,2};

        int[] array2={3,5,4,3,53,62,363,24,34};

        double[] array3={3.3D, 4.3D, 8D};

        String[] words2={"Hellp","sdd","sdd"};


    }
}
