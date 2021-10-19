package fanshe;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/19 8:39
 */
public class User {
    private String name;
    private int id;
    private int age;

    public User(){

    }

    public User(String name, int id, int age){
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

