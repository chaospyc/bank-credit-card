package fanshe;

import java.lang.annotation.ElementType;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/17 10:32
 */
public class Test04 {
    public static void main(String[] args) {
        Class c1 = Object.class; // 类
        Class c2 = Comparable.class; //接口
        Class c3 = String[].class; // 一维数组
        Class c4 = int[][].class;   // 二维数组
        Class c5 = Override.class; // 注解
        Class c6 = ElementType.class; //枚举类型
        Class c7 = Integer.class; // 基本数据类型
        Class c8 = void.class; // void
        Class c9 = Class.class; // Class

        System.out.println( c1);
        System.out.println( c2);
        System.out.println( c3);
        System.out.println( c4);
        System.out.println( c5);
        System.out.println( c6);
        System.out.println( c7);
        System.out.println( c8);
        System.out.println( c9);

        int[] a  = new int[10];
        int[] b  = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }
}
