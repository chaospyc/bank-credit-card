package fanxing;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/15 8:14
 */


public class PairHelper {
    static int add(Pair<Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }
}
