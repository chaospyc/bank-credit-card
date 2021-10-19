package fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/19 8:59
 */
public class Test10 {
    public static void test01(){
        User user = new User();
        long starttime  = System.currentTimeMillis();
        for(int i = 0 ;i <=1000000000;i++){
            user.getName();
        }
        long endtime = System.currentTimeMillis();
        System.out.println("普通方法执行10亿次" + (endtime-starttime)   + "ms");
    }

    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();

        Method getName  = c1.getDeclaredMethod("getName",null);
        long starttime  = System.currentTimeMillis();
        for(int i = 0 ;i <=1000000000;i++){
           getName.invoke(user,null);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("反射方法执行10亿次" + (endtime-starttime)   + "ms");
    }

    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();

        Method getName  = c1.getDeclaredMethod("getName",null);
        getName.setAccessible(true);
        long starttime  = System.currentTimeMillis();
        for(int i = 0 ;i <=1000000000;i++){

            getName.invoke(user,null);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("setAccessible执行10亿次" + (endtime-starttime)   + "ms");
    }


    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
        test03();
    }
}
