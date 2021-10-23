package IOTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 8:46
 */
public class ClassPrthTest {
    public static void main(String[] args) throws IOException {
//        try(InputStream input = getClass.getRw)
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try(ObjectOutputStream output = new ObjectOutputStream(buffer)){
            //写入 int
            output.writeInt(12345);
            //写入String
            output.writeUTF("Hello");
            //写入Object
            output.writeObject(Double.valueOf(123.456));
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}
