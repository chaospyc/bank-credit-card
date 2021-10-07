import java.util.Scanner;

public class number100SUM {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please min Number");
        int minInput = n.nextInt();
        System.out.println("Please max Number");
        int maxInput = n.nextInt();
        int sum;
        sum=0;
        while(minInput<=maxInput){
            sum = sum +minInput;
            minInput++;
        }
        System.out.println(sum);
    }
}
