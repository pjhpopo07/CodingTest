package chap_04;
/// int row로 선언해라
/// 참고 println()은 출력후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 print()를 사용하면 된다
/// System.out.print("*")
/// //rows=2
/// *
/// **
public class forEx5 {
    public static void main(String[] args) {
        for(int row=0;row<=5;row++){
            for(int i = 0; i<=row; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
