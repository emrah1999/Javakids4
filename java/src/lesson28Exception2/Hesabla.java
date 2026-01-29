package lesson28Exception2;

import java.awt.image.AbstractMultiResolutionImage;

public class Hesabla {
    public void divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Sifira bolmek olmaz");
        }
        System.out.println(a/b);
    }

}
