package ReJect;

public class InsanceClass {
    public static void main(String[] args) {
        Class cls = String.class;
        String s = (String) cls.getDeclaredConstructor().newInstance();
    }
}
