package BackJoon;
import java.util.Scanner;

public class pro1330 {
    public static void main(String[] args) {
        int A,B;

        Scanner sc = new Scanner(System.in);

        System.out.println("A의 값");
        A = sc.nextInt();

        System.out.println("B의 값");
        B = sc.nextInt();

        if(A>B) {
            System.out.println(">");
        }
        else if(A<B){
            System.out.println("<");
            }
        else {
            System.out.println("==");
        }
    }
}
