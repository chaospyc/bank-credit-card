import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("chaos");
        s1.setAge(24);
        s1.setScore(100);
        System.out.println(s1.getScore() + "   " + s1.getAge() + "  " + s1.getName());

    }
}
class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;

    }
}

class Student extends Person{

    private int score;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

