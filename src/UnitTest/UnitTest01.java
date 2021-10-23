package UnitTest;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/23 10:00
 */
public class UnitTest01 {

    public static long fact(long n ){
        long r = 1;
        for(long i =1;i<=n;i++){
            r = r*i;
        }
        return r;
    }
}
