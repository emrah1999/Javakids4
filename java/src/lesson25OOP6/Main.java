package lesson25OOP6;

public class Main {
    public static void main(String[] args) {
        Integer a=2345;
        Integer b=3253;
        int max=findMinMax(a,2);
        int min=findMinMax(b,1);
        System.out.println("Minimum digit in "+b+" is: "+min);
        System.out.println("Maximum digit in "+a+" is: "+max);

        System.out.println(min*max);
    }

    public static Integer findMinMax(Integer number,int type){
        int start=type==1?9:1;
        while (number>0){
            int qaliq=number%10;
            if(type==1 && qaliq<start){
                start=qaliq;
            }else if(type==2 && qaliq>start){
                start=qaliq;
            }
            number/=10;
        }
        return start;
    }
}
