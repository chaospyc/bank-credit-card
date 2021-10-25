package BIanMa;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 7:03
 */
public class HashCodeTest01 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update("Hello".getBytes(StandardCharsets.UTF_8));
        md.update("World".getBytes(StandardCharsets.UTF_8));
        byte[] result = md.digest();
        System.out.println(new BigInteger(result).toString(16));
    }
}
