package setTest;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 8:30
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange",1);
        map.put("apple",2);
        map.put("pear",3);

        for(String key:map.keySet()){
            System.out.println(key +"  " +  map.get(key));
        }
    }
}
