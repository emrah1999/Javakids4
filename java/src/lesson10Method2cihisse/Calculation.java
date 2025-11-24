package lesson10Method2cihisse;

public class Calculation {
    public void sum(int a,int b){
        System.out.println("Toplam: "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("Ferq "+(a-b));
    }
    public void multiply(int a,int b){
        System.out.println("Vurma: "+(a*b));
    }
    public int divider(int a,int b){
        return a/b;
    }
    public void qaliq(int a,int b){
       if(b==0){
           return;
       }
        System.out.println("Qaliq: "+(a%b));
    }

}
