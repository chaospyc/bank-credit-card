package fanshe;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/19 9:47
 */
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        // 通过反射获得注解
        Class c1 = Class.forName("fanshe.Student2");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);

        }

        // 获得注解的value的值
        TableChaos tableChaos = (TableChaos) c1.getAnnotation(TableChaos.class);
        String value = tableChaos.value();
        System.out.println(value);

        // 获得类指定的注解

        Field f = c1.getDeclaredField("name");
        FieldChaos fieldChaos = f.getAnnotation(FieldChaos.class);
        System.out.println(fieldChaos.columnName());

    }
}


//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableChaos{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldChaos{
    String columnName();
    String type();
    int length();
}