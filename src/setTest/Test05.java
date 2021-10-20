package setTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 7:45
 */
public class Test05 {
    public static void main(String[] args) {
        String key1 = "a";
        Map<String,Integer> map = new HashMap<>();
        map.put(key1,123);

        String key2 = new String("a");
        map.get(key2);

        System.out.println(key1 == key2);
        System.out.println(key1.equals(key2));
        int index = key2.hashCode() & 0xf;
        System.out.println(index);
        Map<String,Person> map1 = new HashMap<>(10000);
        map1.put("a", new Person("Xiao Ming"));
        map1.put("b", new Person("Xiao Hong"));



    }
}


class Person1{
    String firstName;
    String lastName;
    int age;

//    @Override
//    int hashCode(){
////        int h = 0;
////        h = 31*h +firstName.hashCode();
////        h = 31*h + lastName.hashCode();
////        h = 31*h + age;
//        return Objects.hash(firstName,lastName,age);
//
//    }

}