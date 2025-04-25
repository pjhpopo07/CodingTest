package chap_03;
/// 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자.
public class CondEX1 {
    public static void main(String[] args) {
        int score=75;
        String grade;

        if(score>=90){
            grade="A";
        }
        else if(score>=80){
            grade="B";
        }
        else if(score>=70){
            grade="C";
        }
        else if(score>=60){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("학점은 "+grade+"입니다.");
    }
}
