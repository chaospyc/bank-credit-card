package setTest;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 8:37
 */
public class TreeMapTest02 {
    public static void main(String[] args) {
        Map<Student1,Integer> map1 = new TreeMap<>(new Comparator<Student1>() {

            public int compare(Student1 o1, Student1 o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        map1.put(new Student1("Tom"),1);
        map1.put(new Student1("chaos"),2);
        map1.put(new Student1("lily"),3);
        for(Student1 key : map1.keySet()){
            System.out.println(key);
        }
        System.out.println(map1.get(new Student1("chaos")));


    }
}


class Student1 {
    public String name;
    public int score;

    Student1(String name) {
        this.name = name;

    }

    public String toString() {
//        return String.format("{%s ： score = %的}",name);

        return "{Student: " + name + "} ";
    }
}