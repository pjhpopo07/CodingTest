package CodeUp;
import java.util.Scanner;

public class pro1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float m = sc.nextInt();
        float k = sc.nextInt();

        double result;
        result= (n+m+k)/3.0;

        System.out.printf("%.2f",result);
    }


}

