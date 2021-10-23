package IOTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 10:33
 */
public class FileTest02 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("src\\IOTest\\Notebo.txt"));
        String content1 = Files.readString(Paths.get("src\\IOTest\\Notebo.txt"));
    }
}
