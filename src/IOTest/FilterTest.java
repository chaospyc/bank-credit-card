package IOTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 7:59
 */
public class FilterTest {
    public static void main(String[] args) throws IOException {
        InputStream file = new FileInputStream("test.gz");
        InputStream buffered = new BufferedInputStream(file);
        InputStream gzip = new GZIPInputStream(buffered);




    }
}
