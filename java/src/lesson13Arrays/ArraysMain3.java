package lesson13Arrays;

import java.util.Arrays;

public class ArraysMain3 {
    public static void main(String[] args) {
        int[] numbers={34,56,26,23,98,43};
        int max=numbers[0];//98
        for (int num:numbers){
            if(num>max){
               max=num;
            }
        }
        System.out.println("Max number is: "+max);

        boolean found=true;
        int count=1;
        while (found){
            found=false;
            for(int i=0;i<numbers.length-count;i++){
                if(numbers[i]>numbers[i+1]){
                    found=true;
                    int temp=numbers[i]; //56
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=temp;
                    //34,26,23,56,43,98
                    //26 34 23 56 43 98
                    //26 23 34 43 56 98
                    // 23 26 34 43 56 98
                }

            } count++;//2
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
