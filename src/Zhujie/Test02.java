package Zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/16 9:47
 */
public class Test02 {
    @MuAnnotation
    public void Test02(){

    }
}

// 定义一个注解
// Target 表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE} )

// Retention 表示我们的注解在什么地方还有效
// RUNTIME>CLASS/SURCES
@Retention(value = RetentionPolicy.RUNTIME)

// Deprecated 表示是否将我们的注解生成在JAVAdoc中

@Deprecated
@interface MuAnnotation{
}