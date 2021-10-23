package IOTest;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 7:06
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        byte[] data;
        try(ByteArrayOutputStream output = new ByteArrayOutputStream()){
            output.write("Hello".getBytes(StandardCharsets.UTF_8));
            output.write("world".getBytes(StandardCharsets.UTF_8));
            data = output.toByteArray();
        }

        System.out.println(new String(data,StandardCharsets.UTF_8));

    }
}
