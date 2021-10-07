import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        Book1 oldMan = new Book1();
        oldMan.setNameAndSumpage("old man",12);
        System.out.println(oldMan.getName()  +  oldMan.getSumPage());

        Group1 books = new Group1();
        Group1 b1 = new Group1();
        b1.setNames1(null);
        System.out.println(b1.getNames());

    }
}

class Group1{
    private String[] names;
    public void setNames1(String... names2){
        this.names = names2;
    }
    public void setNames(String[] names){

        this.names = names;
    }

    public String[] getNames(){
        return names;
    }
}

class Book1{
    private String name;
    private int sumPage;

    public void setNameAndSumpage(String name,int sumPage){
        this.name = name;
        this.sumPage = sumPage;

    }

    public String getName() {
        return name;
    }

    public int getSumPage() {
        return sumPage;
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
}

