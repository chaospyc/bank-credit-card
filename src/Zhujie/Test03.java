package Zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/16 10:04
 */
public class Test03 {
    @Myannotation(name ="chaos",schools = {"西南财大","清华大学"})
    public void Test03(){
    }
    @Myannotation2("chaos")
    public void Test(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation{
    // 注解的参数：参数类型 + 参数名(）
    String name() default "";
    int age() default  0;
    int id() default -1; // 如果默认值为-1，代表不存在，indexof ，如果找不到就返回-1；

    String[] schools() default  {"", "ss"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation2{
    String value();

}