package DetaTIME;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/23 8:04
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getYear()+1900);
        Calendar rightNow = Calendar.getInstance();

        System.out.println(rightNow.getWeekYear());
        System.out.println(rightNow.getTime());
        System.out.println(date.getTime());
        System.out.println(rightNow.toString());
        var sdf = new SimpleDateFormat("E MM dd,yyyy");
        System.out.println(sdf.format(date));
        TimeZone tzDefault = TimeZone.getDefault();
        TimeZone tzGMT09 = TimeZone.getTimeZone("GMT+09:00");
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
        System.out.println(tzDefault.getID());
        System.out.println(tzGMT09.getID());
        System.out.println(tzNY.getID());



    }
}
