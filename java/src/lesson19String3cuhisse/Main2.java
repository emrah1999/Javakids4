package lesson19String3cuhisse;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.RoundingMode.HALF_UP;

public class Main2 {
    public static void main(String[] args) {
        BigInteger eded=new BigInteger("434");
        BigInteger eded2=new BigInteger("43453");
        BigInteger sum=eded.add(eded2);
        BigInteger vurma=eded.multiply(eded2);
        BigInteger cixma=eded.subtract(eded2);
        BigInteger bolme=eded.divide(eded2);
        BigInteger qaliq=eded.mod(eded2);
        System.out.println("Sum: "+sum);
        System.out.println("Vurma: "+vurma);
        System.out.println("Cixma: "+cixma);
        System.out.println("Bolme: "+bolme);
        System.out.println("Qaliq: "+qaliq);

        BigDecimal eded3=new BigDecimal("0.24546343");
        BigDecimal eded4=new BigDecimal("0.1234234");

        BigDecimal sum2=eded3.add(eded4);
        System.out.println("Sum2: "+sum2);

        BigDecimal eded5=new BigDecimal("10");
        BigDecimal eded6=new BigDecimal("3");


        System.out.println(eded5.divide(eded6,4, HALF_UP));

        System.out.println(0.1+0.2);
    }
}
