package ReJect;

import java.lang.reflect.Constructor;

public class InsanceClass {
    public static void main(String[] args) throws Exception{
        String s ="";
        Class cls = s.getClass();
        Class cls2 = Class.forName("java.lang.String");
        System.out.println(s);
        System.out.println(cls);
        System.out.println(cls2);

        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(i);
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());


    }
}

class Student extends Person{

    public int Student(int age){
        return age;
    }

}


class Person{
    public int age;

    public Person(){
        System.out.println("this is Person");
    }

    public Person(int age){
        System.out.println(age);
    }

    public int getAge() {
        return age;
    }
}