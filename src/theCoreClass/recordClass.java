package theCoreClass;

import java.io.PipedOutputStream;

public class recordClass {
    public static void main(String[] args) {
        Point p = new Point(123,456);

        System.out.println(p.x());

        var x = Point.of();
        var y = Point.of(10,222);
        System.out.println(x);
        System.out.println(y.x());
    }

}

record Point(int x,int y){
    public static Point of(){
        return new Point(0,0);
    }

    public  static Point of(int x, int y ){
        return new Point(x,y);
    }

}