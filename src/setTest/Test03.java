package setTest;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/18 8:58
 */
public class Test03 {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
    static int findMissingNumber(int start, int end, List<Integer> list) {
        int key = 0;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 10; i <= 20; i++) {
            list1.add(i);
        }

        for (Integer integer : list1) {
            if(! list.contains(integer)){
                key = integer;
                break;
            }

        }
        return key;

    }

}

