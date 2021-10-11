package theCoreClass;

import java.util.Scanner;

public class meijuClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();

        Weekday day = Weekday.SUN;
        switch(day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is "  +day + ".Work at office");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day + ". Work at home!");
                break;
            default:
                throw new RuntimeException("cannot process " + day);
        }
    }
}


