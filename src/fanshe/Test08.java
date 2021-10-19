package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/17 16:22
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1  = Class.forName("fanshe.Person");


//        Student s1 = new Student();
//        c1 = s1.getClass();
        //获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        // 获得类的属性
        System.out.println("================");
        Field[] fields = c1.getFields();

        fields = c1.getDeclaredFields(); // 找到全部的属性
        for(Field field:fields){
            System.out.println(field);
        }

        // 找到指定属性的值

        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("============");
        Method[] methods = c1.getMethods(); // 获得本类及其父类的全部方法
        for (Method method : methods) {
            System.out.println("正常的： " + method);
        }

        methods = c1.getDeclaredMethods(); // 获得本类的全部方法
        for (Method method : methods) {
            System.out.println("getDeclaredMethods：   " + method);
        }

        //获得指定方法
        System.out.println("============");
        Method getName = c1.getMethod("getName",null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        // 获得指定的构造器
        System.out.println("====================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        // 获得指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
        System.out.println("指定：  " +  declaredConstructor);

    }
}
