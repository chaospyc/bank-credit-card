package setTest;

import java.util.Iterator;
import java.util.List;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 7:15
 */
public class ItertorTest {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple","pear","banana");

        //迭代器
        for(Iterator<String> it = list1.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }

    }
}
