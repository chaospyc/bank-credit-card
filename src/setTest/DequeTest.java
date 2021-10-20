package setTest;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 6:50
 */
public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        System.out.println(deque);
        deque.offerFirst("C");
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
    }
}
