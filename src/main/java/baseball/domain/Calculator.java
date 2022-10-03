package baseball.domain;

//public = 공용, 공공 어디서나 사용 가능
//private = Calculator 범위 안에서만 사용
public class Calculator {   //class = 파일
    //final = 값이 변해서는 안된다
    public static final int SHARE_BITRHDAY = 227;   //상수, 전부 대문자, 언더스코어 사용, 클래스 변수이면서 변하지 않는 값
    //static = 공유해서 사용한다
    public static int shareResult = 0;  //static이 붙으면 클래스 변수
    public int result = 0;  //인스턴스 변수
    public Calculator() {   //생성자, art + insert
        // SHARE_BITRHDAY = 1111;   //오류발생
    }

    //메소드(인스턴스 메소드)
    public int add(int number1, int number2) {  //add = 숫자 2개를 받아서 정수로 반환
        result = number1 + number2;
        shareResult = result;   //공유가 되어도 result의 값은 변하지 않음
        return result;   //무언가를 반환하겠다고 한다면 return이 반드시 필요.
    }
}
