package IOTest;

import javax.imageio.IIOException;
import java.io.*;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 7:55
 */
public class OutPutTest {
    public static void main(String[] args) throws IOException {
        try(InputStream input = new FileInputStream("input.txt");
            OutputStream output = new FileOutputStream("output.txt")
    ){
            input.transferTo(output);}
    }
}
