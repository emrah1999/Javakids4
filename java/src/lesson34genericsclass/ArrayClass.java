package lesson34genericsclass;

import java.lang.reflect.Array;

public class ArrayClass {
    int[] array;
    int index=0;
    public ArrayClass(){
        array=new int[3];
    }
    public void addElement(int element){
        if(index==array.length){
            int[] newArray=new int[array.length+1];
            for (int i = 0; i < index; i++) {
                newArray[i]=array[i];
            }
            array=newArray;
            array[index]=element;
            index++;
        }else {
            array[index] = element;
            index++;
        }
    }

    @Override
    public String toString() {
        String result="[";
        for(int i=0;i<array.length;i++){
            result+=array[i]+",";
        }
        return result+"]";
    }
}
