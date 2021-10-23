package DetaTIME;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/23 9:46
 */
public class InstantTest01 {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        long ts =zdt.toEpochSecond() * 1000;

        Date date = new Date(ts);

        System.out.println();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
