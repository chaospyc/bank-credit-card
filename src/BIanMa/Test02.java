package BIanMa;

import java.util.Arrays;
import java.util.Base64;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 6:44
 */
public class Test02 {
    public static void main(String[] args) {
//        byte[] input = new byte[] { (byte) 0xe4, (byte) 0xb8, (byte) 0xad, 0x21 };
//        String b64encoded = Base64.getEncoder().encodeToString(input);
//        String b64encoded2 = Base64.getEncoder().withoutPadding().encodeToString(input);
//        System.out.println(b64encoded);
//        System.out.println(b64encoded2);
//        byte[] output = Base64.getDecoder().decode(b64encoded2);
//        System.out.println(Arrays.toString(output));

        byte[] input = new byte[] { 0x01, 0x02, 0x7f, 0x00 };
        String b64encoded = Base64.getUrlEncoder().encodeToString(input);
        byte[] output = Base64.getUrlDecoder().decode(b64encoded);

        System.out.println(b64encoded);
        System.out.println(Arrays.toString(output));



    }


}
