package fanshe;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/17 10:00
 */
public class Person {
    String name;
    private int id;
    private int age;

    public Person(){

    }

    public Person(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return "User{" + "name" + "\'"
                +", id = " + id +
                ", age = " + age +
                "}";
    }

}
