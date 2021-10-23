package IOTest;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Field;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 9:27
 */
public class fileListTest {
    public static void main(String[] args) {
        File f = new File("C:\\windows");
        File[] flist = f.listFiles();
        printFiles(flist);
        File[] flist2 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });

        printFiles(flist2);

    }
    static void printFiles(File[] files){
        System.out.println("==============");
        if(files != null){
            for (File file : files) {
                System.out.println(file);

            }
        }

        System.out.println("==============");
    }
}
