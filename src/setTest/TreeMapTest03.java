package setTest;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 16:31
 */
public class TreeMapTest03 {
    public static void main(String[] args) {
        Map<Students, Integer> map = new TreeMap<>(new Comparator<Students>() {
            public int compare(Students s1,Students s2){
                if (s1.score == s2.score){
                    return 0;
                }

                return s1.score < s2.score ? -1 : 1;
            }
        });
        map.put(new Students("Tom", 77), 1);
        map.put(new Students("Bob", 66), 2);
        map.put(new Students("Lily", 99), 3);
        for(Students key: map.keySet()){
            System.out.println(key);
        }

    }
}

class Students{
    public String name;
    public int score;
    Students(String name,int score){
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return String.format("{%s : score = %d", name,score);
    }
}