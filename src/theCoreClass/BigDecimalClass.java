package theCoreClass;

import java.math.BigDecimal;
import java.lang.System;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;

public class BigDecimalClass {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("11");
        BigDecimal d2 = new BigDecimal("3");
        BigDecimal[] dr = d1.divideAndRemainder(d2);
        BigDecimal d3 = d1.divide(d2,10,RoundingMode.HALF_DOWN);
        System.out.println(Arrays.toString(dr));

        if( dr[1].signum() == 0){
            System.out.println("是整除的");

        }
    }
}
