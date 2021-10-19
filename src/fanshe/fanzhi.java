package fanshe;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/17 9:37
 */

// 什么是反射
public class fanzhi {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的对象
        Class c1 =  Class.forName("fanshe.Person");
        System.out.println(c1);

        // 一个类在内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在CLass对象中。
    }

}

