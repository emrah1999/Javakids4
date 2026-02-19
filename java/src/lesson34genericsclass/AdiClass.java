package lesson34genericsclass;

public class AdiClass<T> {
    T name;

    public void setName(T name){
        this.name=name;
    }

    public T getName(){
        return name;
    }

    public AdiClass(){

    }

    public AdiClass(T name){
        this.name=name;
    }
}
