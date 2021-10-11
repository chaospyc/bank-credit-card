package theCoreClass;

import java.math.BigInteger;

public class BIgInterClass {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("1234567890");
        System.out.println(i1.add(i2).doubleValue());
    }
}
