package setTest;

import java.util.HashSet;
import java.util.Set;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 18:29
 */
public class SetTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("xyz");
        set.add("xyz");
        System.out.println(set);
        System.out.println(set.contains("hello"));
        System.out.println(set.size());
    }
}
