package setTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 6:25
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);

        List<String> l = new LinkedList<>();
        l.add("apple");
        l.add("pear");
        l.add("banana");

        System.out.println(l);

    }
}
