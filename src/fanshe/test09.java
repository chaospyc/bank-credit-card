package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/19 8:25
 */

// 动态的创建对象 通过反射

public class test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("fanshe.Person");
        System.out.println(c1);

        // 构建一个对象
        Person person = (Person) c1.newInstance();
        System.out.println(person);

        // 通过构造器构造对象
        Constructor constructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
        Person person1 = (Person)constructor.newInstance("chaos",001,24);
        System.out.println(person1);

        //通过反射调用普通方法
        Person person2 = (Person)c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(person2,"chaos");
        System.out.println(person2.getName());

        // 通过反射操作属性
        Class c2 = Class.forName("fanshe.User");
        System.out.println("===========================");
        User user3 = (User)c2.newInstance();
        Field name = c2.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user3,"Chaos");
        System.out.println(user3.getName());

    }

}
