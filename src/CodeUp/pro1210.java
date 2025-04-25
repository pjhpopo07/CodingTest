package CodeUp;

import java.util.Scanner;


public class pro1210 {
    public static void main(String[] args) {
        int a=400;
        int b=340;
        int c=170;
        int d=100;
        int e=70;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int cal1=calmenu(n);
        int cal2=calmenu(m);

        int result=cal1+cal2;

        if(result>500){
            System.out.println("angry");
        }
        else{
            System.out.println("no angry");
        }


    }
    public static  int calmenu(int menu) {
        switch (menu) {
            case 1:
                return 400;
            case 2:
                return 340;
            case 3:
                return 170;
            case 4:
                return 100;
            case 5:
                return 70;
            default: return 0;
        }
    }
}
