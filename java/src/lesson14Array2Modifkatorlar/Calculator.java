package lesson14Array2Modifkatorlar;

 public class Calculator {
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public Calculator(){
        System.out.println("default");
    }

    public int sum(int ... arr){
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        return sum;
    }

    public void metod2(String ... array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }


}
