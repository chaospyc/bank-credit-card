package fanshe;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/19 9:07
 */

//通过反射获取泛型
public class Test11 {
    public void test01(Map<String,User> map, List<User> lsit){
        System.out.println("test01");
    }

    public Map<String,User> test01(){
        System.out.println("tess02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test11.class.getMethod("test01",Map.class,List.class);

        Type[] genericParameterTypes  = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
            if(genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments =  ((ParameterizedType) genericParameterType).getActualTypeArguments();
                System.out.println(actualTypeArguments);
            }
        }

        method = Test11.class.getMethod("test01", null);
//        Type[] genericReturnType = method.getGenericParameterTypes();
        Type genericReturnType = method.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
           Type[] actualTypeArguments =  ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }

}
