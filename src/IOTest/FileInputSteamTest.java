package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 6:48
 */
public class FileInputSteamTest {
    public static void main(String[] args) {
        String s1;
        try(InputStream input = new FileInputStream("src\\IOTest\\Notebo.txt")){
            int n;
            StringBuilder sb = new StringBuilder();
            while((n =input.read()) != -1){
                sb.append((char) n);
            }
            s1 = sb.toString();
            System.out.println(s1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
