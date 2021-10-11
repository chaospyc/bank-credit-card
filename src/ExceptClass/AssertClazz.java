package ExceptClass;

public class AssertClazz {
    public static void main(String[] args) {
        int x = -1;
        assert x > 0 :" this number must less zero";
        System.out.println(x);
    }
}
