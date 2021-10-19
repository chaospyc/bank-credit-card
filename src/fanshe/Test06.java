package fanshe;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/17 14:42
 */
public class Test06 {

    static{
        System.out.println("Mian class to load");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        // 主动引用
//        Son son = new Son(); // 加载Main class，loading Father class，loading Son class

        // 反射也会产生主动引用
//        Class.forName("fanshe.Son");
        // 不会产生类的引用的方法
        System.out.println(Son.b); // 子类调用父类的方法

        Son[] arr = new Son[5]; //构造一个数组

        System.out.println(Son.M); //调用常量池中的方法


    }
}

class Father{

    static int b = 2;
    static {
        System.out.println("父类被加载");
    }

}

class Son extends Father{

    static {
        System.out.println("子类被加载");
    }

    static int m = 100;
    static final int M=1;

}