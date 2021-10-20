package setTest;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/20 8:24
 */
public class EnumMapTest {
    public static void main(String[] args) {
        Map<DayOfWeek,String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY,"星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }
}
