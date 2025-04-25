package chap_03;
///요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자(if문 활용하자)
public class CondEx4 {
    public static void main(String[] args) {
        double rating=8.6;

        if(rating<=9){
            System.out.println("'어바웃타임'을 추천합니다");
        }
        if(rating<=8){
            System.out.println("'토이 스토리'을 추천합니다");
        }
        if(rating<=7){
            System.out.println("'고질라'을 추천합니다");
        }
    }
}
