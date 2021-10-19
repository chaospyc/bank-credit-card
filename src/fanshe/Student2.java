package fanshe;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/19 9:47
 */
@TableChaos("db_studengt")
public class Student2 {

    @FieldChaos(columnName = "bd_name",type = "varchar",length = 10)
    private String name;

    @FieldChaos(columnName = "bd_id",type = "int",length = 13)
    private int id;

    @FieldChaos(columnName = "da_age",type = "int",length = 3)
    private int age;

    public Student2(){

    }

    public Student2(String name, int id, int age){
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