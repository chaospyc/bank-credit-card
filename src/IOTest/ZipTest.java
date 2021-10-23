package IOTest;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 8:32
 */
//public class ZipTest {
//    public static void main(String[] args) throws IOException {
//        byte[] data = "Hello,world".getBytes(StandardCharsets.UTF_8);
////        try(ZipInputStream zip = new ZipInputStream(new FileInputStream())){
//            ZipEntry entry = null;
//            while((entry = zip.getNextEntry()) != null){
//                String name = entry.getName();
//                if(!entry.isDirectory()){
//                    int n;
//                    while ((n = zip.read()) != 1){
//                        System.out.println("SS");
//
//                    }
//                }
//
//            }
//        }
//    }
//}
