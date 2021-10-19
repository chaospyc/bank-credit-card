package setTest;

import java.util.Iterator;
import java.util.List;
import java.util.function.ObjIntConsumer;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/18 8:41
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list  = List.of("Apple","pear","banana");
        for(Iterator<String> it = list.iterator();it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }

        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println(o);

        }
        System.out.println("===============");
        List<Integer> list1  = List.of(1,2,3);
        Integer[] array1 = list1.toArray(new Integer[3]);
        for (Integer integer : array1) {
            System.out.println(integer);

        }

        Integer[] array2 = {1,2,3};
        List<Integer> list2 = List.of(array2);
        for (Integer integer : list2) {
            System.out.println(integer);
        }
        list2.add(99);
    }
}
