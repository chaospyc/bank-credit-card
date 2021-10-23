package setTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 7:52
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        // 变为不可变集合:
        List<String> immutable = Collections.unmodifiableList(mutable);
        // 立刻扔掉mutable的引用:
        mutable = null;
        System.out.println(immutable);
    }

}
