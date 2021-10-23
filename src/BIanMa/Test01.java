package BIanMa;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 6:36
 */
public class Test01 {
    public static void main(String[] args) {
        String encoded = URLEncoder.encode("中文!", StandardCharsets.UTF_8);
        System.out.println(encoded);
        String decoded = URLDecoder.decode("%E4%B8%AD%E6%96%87%21",StandardCharsets.UTF_8);
        System.out.println(decoded);
        byte[] input = new byte[]{(byte) 0xe4,(byte) 0xb8,(byte) 0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);
        byte[] output = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output));




    }
}
