package lesson24OOP5cihisse;

public class MainClass {
     class InnerClass{
        public int a;
        void display() {
            System.out.println("Inner class method called. a = " + a);
        }
        public InnerClass (int a){
            this.a = a;
        }
        public InnerClass (){

        }
    }

    public void method1(){
         class MetodClass{
             public int b;
         }
            MetodClass metodClass=new MetodClass();
            metodClass.b=20;
            System.out.println("Method class variable b = " + metodClass.b);
    }

    static class StaticInnerClass{
        public int c;
        void display() {
            System.out.println("Static Inner class method called. c = " + c);
        }
    }

    interface InnerInterface{
        void show();
    }


}
