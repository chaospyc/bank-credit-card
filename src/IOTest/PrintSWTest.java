package IOTest;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 10:28
 */
public class PrintSWTest {
    public static void main(String[] args) {
        StringWriter buffer = new StringWriter();
        try(PrintWriter pw = new PrintWriter(buffer)){
            pw.println("Hello");
        }
        System.out.println(buffer.toString());
    }
}

