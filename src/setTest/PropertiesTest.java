package setTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 17:00
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {

        Properties props = new Properties();
        props.load(new FileReader("setting.properties", StandardCharsets.UTF_8));
//        props.load(new java.io.FileInputStream(f));

        String filepath = props.getProperty("last_open_file");
        String interval = props.getProperty("auto_save_interval","120");
        System.out.println(filepath);
        System.out.println(interval);
    }
}
