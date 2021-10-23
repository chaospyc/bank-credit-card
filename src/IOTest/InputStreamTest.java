package IOTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 9:43
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        test t1 = new test();
        t1.readFile();


    }

}

class test{
    public void readFile() throws IOException {
        // 创建一个FileInputStream对象:
        try(InputStream input = new FileInputStream("src\\IOTest\\Notebo.txt")){

            int n ;
            while((n = input.read()) != -1){
                System.out.println(n);

            }
        }
        }
    }