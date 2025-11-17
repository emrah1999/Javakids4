package lesson7Practise;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int eded=scanner.nextInt();
        int max=0;
        int min=9;
        while(eded>0){
            int reqem=eded%10;
            if(reqem>max){
                max=reqem; // max=7
            }
            if(reqem<min){
                min=reqem;//min=2
            }
            eded/=10;
        }
        System.out.println("--------------------------------");

        System.out.println("Max+Min  "+(max+min));


        int a=4,b=6,c=5;
        if(a<b && b<c){
            System.out.println(b +" ortadir");
        }
    }
}
