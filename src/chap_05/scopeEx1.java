package chap_05;

public class scopeEx1 {
    public static void main(String[] args) {
        int m=10; //m 생존 시작
        if(true){
            int x=20; //x생존 시작
            System.out.println("if m="+m);
            System.out.println("if x="+x);

        }
    }
}
