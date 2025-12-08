package lesson14Array2Modifkatorlar;

public class Main2 {
    public static void main(String[] args) {
        int[][] array={{1,3},{2,4},{49,2}};

        for(int i=0;i<array.length;i++){
            for (int j = 0; j <array[i].length ; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
