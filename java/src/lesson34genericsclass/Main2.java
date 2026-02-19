package lesson34genericsclass;

public class Main2 {
    public static void main(String[] args) {
        GenericClass<String,Integer> object=new GenericClass<>();

        object.name1="Arif";
        object.name2=123;

        GenericClass<String, String> object2=new GenericClass<>();
        object2.name1="Sevinc";
        object2.name2="Deniz";


    }
}
