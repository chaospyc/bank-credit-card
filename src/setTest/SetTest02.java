package setTest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 18:33
 */
public class SetTest02{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("pear");
        set.add("orange");
        for (String s : set) {
            System.out.println(s);
        }
    }
}