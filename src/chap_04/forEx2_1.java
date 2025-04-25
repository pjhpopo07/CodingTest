package chap_04;

public class forEx2_1 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
