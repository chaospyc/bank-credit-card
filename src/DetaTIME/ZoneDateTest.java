package DetaTIME;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/23 8:59
 */
public class ZoneDateTest {
    public static void main(String[] args) {
//        ZonedDateTime zdj = ZonedDateTime.now();
//        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
//        System.out.println(zdj);
//        System.out.println(zny);



//        LocalDateTime ldt = LocalDateTime.of(2019, 9, 15, 15, 16, 17);
//        ZonedDateTime zbj = ldt.atZone(ZoneId.systemDefault());
//        ZonedDateTime zny = ldt.atZone(ZoneId.of("America/New_York"));
//        System.out.println(zbj);
//        System.out.println(zny);

        ZonedDateTime zdj = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zny = zdj.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zdj);
        System.out.println(zny);

    }
}
