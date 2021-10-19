package setTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/18 8:18
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(null);
        list.add("like");
        System.out.println(list.size());
        System.out.println(list.get(1));
        List<Integer> list1  = List.of(1,2,34,4);
        for(int i=0;i<list1.size();i++){
            int s = list1.get(i);
            System.out.println(s);
        }

        for (Integer integer : list1) {
            System.out.println(integer);

        }
            }
}
