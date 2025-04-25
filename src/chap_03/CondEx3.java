package chap_03;
/// 특정 금액을 미국 달려에서 한국 원으로 변환하는 프로그램을 작성하자. 환율은 1달러당 1300원이라고 가정합니다. 다음과 같은 기준을 따른다.
public class CondEx3 {
    public static void main(String[] args) {
        int dollar=10;
        int won;

        if(dollar<0){
            System.out.println("잘못된 금액입니다.");
        }
        else if(dollar==0){
            System.out.println("환전할 금액이 없습니다.");
        }
        else{
            won=dollar*1300;
            System.out.println("환전 금액은 "+won+"입니다.");
        }
    }
}
