package fanxing;

import java.awt.*;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassTTest {
    public static void main(String[] args) {
        Class<IntPair> clazz = IntPair.class;
        Type t = clazz.getGenericSuperclass();
        if(t instanceof ParameterizedType){
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments();
            Type firstType = types[0];
            Class<?> typeClass  = (Class<?>) firstType;
            System.out.println(typeClass);
        }


    }
}


