package chap_03;
/// 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
public class CondEX2 {
    public static void main(String[] args) {
        int distance =5;

        if(distance<=1){
            System.out.println("도보를 이용하세요");
        }
        else if(distance<=10){
            System.out.println("자전거를 이용하세요");
        }
        else if(distance<=100){
            System.out.println("자전거를 이용하세요");
        }
        else{
            System.out.println("비행기를 이용하세요");
        }

    }
}
