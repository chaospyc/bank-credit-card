import java.util.Scanner;

public class switchCons {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Please your score");
        int lastScore = score.nextInt();
        switch (lastScore){
            case 10:
                System.out.println("bad");
                break;
            case 20:
                System.out.println("Good");
                break;
            case 30:
                System.out.println("Prefect");
                break;
        }
    }
}

