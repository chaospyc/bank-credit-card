package StringTest;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.lang.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.StringJoiner;

import static java.lang.System.*;
import java.beans.*;

public  class CHAOs {

    public static void main(String[] args) throws Exception{
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd: info.getPropertyDescriptors()){
            out.println(pd.getName());
            out.println("  " + pd.getReadMethod());
            out.println("  "+ pd.getWriteMethod());
        }
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  boolean isChild(){
        return age <=6;
    }
}

