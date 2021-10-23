package IOTest;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 9:56
 */
public class WriteTest {
    public static void main(String[] args) throws IOException {
        try(CharArrayWriter writer = new CharArrayWriter()){
            writer.write(65);
            writer.write(66);
            char[] data = writer.toCharArray();
        }
    }
}
