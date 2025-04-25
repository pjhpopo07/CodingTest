package chap_04;
///중첩 for문을 사용해서 구구단을 완성해라
public class forEx3 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int sum;
                sum=i*j;
                System.out.print(i+"*"+j+"="+sum+"\n");
            }
        }
    }
}
