package setTest;

import java.util.List;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/18 9:47
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("xiao ming"),
                new Person("xiao hong"),
                new Person("Chaos")

        );
        System.out.println(list.contains("Bob"));
    }

}



