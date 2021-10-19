package setTest;

import java.util.List;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/18 9:33
 */
public class equalsTest {
    public static void main(String[] args) {
        List<String> list = List.of("A","B","C");
        System.out.println(list.contains("C"));
        System.out.println(list.contains("X"));
        System.out.println(list.indexOf("C"));
    }
}


class ArratList1{
    Object[] elementData;
    public boolean contains(Object o){
        for(int i =0;i<elementData.length;i++){
            if(o.equals(elementData)){
                return true;
            }
        }
        return false;
    }
}