package DetaTIME;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/23 8:50
 */
public class LocalDateTest {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm ZZZZ");
        System.out.println(formatter.format(zdt));

        var zhformatter = DateTimeFormatter.ofPattern("yyyy MM dd EE HH", Locale.CHINA);
        System.out.println(zhformatter.format(zdt));

        var usFormatter = DateTimeFormatter.ofPattern("E, MMMM/dd/yyyy HH:mm", Locale.US);
        System.out.println(usFormatter.format(zdt));






    }
}
