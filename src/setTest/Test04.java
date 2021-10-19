package setTest;

import java.util.List;
import java.util.Objects;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/18 10:00
 */
public class Test04 {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("xiao ming"),
                new Person("xiao hong"),
                new Person("Chaos")

        );
        System.out.println(list.contains("Bob"));
    }

}


class Person{
    String name;
    int age;
    public Person(String name){
        this.name = name;
    }
    public boolean equals(Object o){
        if(o instanceof Person){
            Person p = (Person) o ;
            return Objects.equals(this.name,p.name) && this.age == age;
        }

        return false;

    }
}

