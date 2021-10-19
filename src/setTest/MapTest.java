package setTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/18 10:08
 */
public class MapTest {
    public static void main(String[] args) {
        Student s = new Student("xiao ming",24);
        Student s1 =new Student("Bob",99);
        Map<String, Student> map = new HashMap<>();
        map.put("xiao ming",s);
        map.put("Bob",s1);
        Student another = map.get("Bob");
        Student target = map.get("xiao ming");
        System.out.println(target == s);
        System.out.println(target.score);
        System.out.println(another.name);

        Fruit f1  = new Student();

    }
}

class Student{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
}