package UnitTest;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 6:28
 */
public class Calculator {
    private long n = 0;

    public long add(long x) {
        n = n + x;
        return n;
    }

    public long sub(long x) {
        n = n - x;
        return n;
    }
}
