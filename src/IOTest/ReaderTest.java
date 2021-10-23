package IOTest;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 9:27
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        try(Reader reader = new InputStreamReader(new FileInputStream("src\\IOTest\\Notebo.txt"))){
            System.out.println(reader.read());
        }
        InputStream input = new FileInputStream("src\\IOTest\\Notebo.txt");
        Reader reader = new InputStreamReader(input,StandardCharsets.UTF_8);
        System.out.println(reader.read());
    }
}

