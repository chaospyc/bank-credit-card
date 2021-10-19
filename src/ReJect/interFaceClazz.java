package ReJect;

import java.util.Arrays;

public class interFaceClazz {
    public static void main(String[] args) {
        Object n = Integer.valueOf(123);
        boolean isDouble = n instanceof Double;
        System.out.println(isDouble);
        boolean isInteger = n instanceof Integer;
        System.out.println(isInteger);
        boolean isNumber = n instanceof Number;
        System.out.println(isNumber);
        boolean isSerializable = n instanceof java.io.Serializable;
        System.out.println(isSerializable);
        boolean isSerializaable = n instanceof  java.io.Serializable;
        System.out.println(isSerializaable);
    }
}
