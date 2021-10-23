package UnitTest;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Factorial {

	public static long fact(long n) {
		long r = 1;
		for (long i = 1; i <= n; i++) {
			r = r * i;
		}
		return r;
	}

}
