package IOTest;

import java.io.File;
import java.io.IOException;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 8:16
 */

//C:\
//C:\Users\chaos\Desktop\gitbase\.
public class FileTest {
    public static void main(String[] args) throws IOException {

        File f = File.createTempFile("temp","txt");
        f.deleteOnExit();
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getAbsolutePath());
//        File f = new File("C:\\Users\\chaos\\Desktop\\gitbase\\src\\IOTest\\Notebo.exe");
//        System.out.println(f);
//        File f1 = new File(".\\gitbase\\src\\IOTest\\Notebo.exe");
//        System.out.println(f1);
//        File f2 = new File("src\\IOTest\\Notebo.exe");
//        System.out.println(f2.isFile());
//        System.out.println(f2.isDirectory());
//        File f3 = new File("src\\IOTest\\test.txt");
//        if(f3.createNewFile()){
//            System.out.println("文件创建成功");
//            if(f3.delete()){
//                System.out.println("文件已删除");
//            }
//
//        }
//        System.out.println(f2);
//        File f = new File("..");
//        System.out.println(f.getPath());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getCanonicalPath());
    }
}
