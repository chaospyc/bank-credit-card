package IOTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 6:43
 */
public class inputStreamTest01 {
    public static void main(String[] args) {
        byte[] data = {72,101,108,108,111,33};
        try(InputStream input = new ByteArrayInputStream(data)){
            int n;
            while ((n=input.read()) != -1){
                System.out.println((char)n);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
