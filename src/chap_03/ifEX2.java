package chap_03;
///온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때,다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
///각각의 할인 조건은 다음과 같다.
/// 1. 아이템 가격이 10000원 이상일 때, 1000원 할인
/// 2. 나이가 10살 이하일 때 1000원 할인///
public class ifEX2 {
    public static void main(String[] args) {
        int price= 12000;
        int age= 9;
        int discount= 0;

        if(price>=10000){
            discount=price-1000;
            System.out.println("가격 천원할인받았습니다"+discount);

        if(age<=10){
            discount=discount-1000;
            System.out.println("가격 천원할인받았습니다"+discount);
        }

        System.out.println("할인 받은 가격"+discount);



        }
    }
}
