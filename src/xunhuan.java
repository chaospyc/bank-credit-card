import java.util.Scanner;

public class xunhuan {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Please input your score");
        int lastScore = score.nextInt();
        while(lastScore >100||lastScore<0){
            System.out.println("Your score is error,Please try again");
            lastScore = score.nextInt();
        }
        if(lastScore>85){
            System.out.println("Prefect");

        }else if (lastScore> 60){
            System.out.println("Good");
        }else{
            System.out.println("bad");
        }
    }
}
