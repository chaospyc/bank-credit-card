package fanxing;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/13 16:25
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Pair[] arr = new Pair[2];
        Pair<String>[] ps = (Pair<String>[]) arr;

        System.out.println(ps.getClass() == Pair[].class);

        String[] ss = ArrayHelper.asArray("a", "b", "c");
        Integer[] ns = ArrayHelper.asArray(1, 2, 3);


    }
    static void setSame(Pair<? super Integer> p, Integer n){
        p.setFirst(n);
        p.setLast(n);
    }
}


class Abc<T>{
    T[] createArray(Class<T> cls){
        return (T[]) Array.newInstance(cls,5);
    }
}


class ArrayHelper{
    @SafeVarargs
    static <T> T[] asArray(T... objs){
        return objs;
    }
}