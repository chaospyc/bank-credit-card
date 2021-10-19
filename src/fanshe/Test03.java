package fanshe;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/17 10:00
 */
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("this person is " + person.name);
        // 通过对象获得
        Class c1  = person.getClass();

        // forname获得
        Class c2 = Class.forName("fanshe.Student");

        // 通过类名.class获得
        Class c3 = Student.class;

        //基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4);

        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);




    }
}
