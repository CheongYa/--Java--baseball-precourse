package baseball;   //baseball 패키지에 속함

import baseball.domain.Calculator;      //baseball.domain 패키지에 있는 Calculator class를 사용함

public class Application {
    public static void main(String[] args) {    //메인 메소드
        Calculator teacher = new Calculator();   //Calculator class를 사용, 선언 할당을 동시에 한 모습
        //new baseball.domain.Calculator() 으로도 사용이 가능하지만 많아지면 너무 지저분해짐
        System.out.println(teacher.add(1, 3));
        System.out.println(teacher.result);
        //System.out.println(teacher.sharResult);   // 4

        Calculator calculator = new Calculator();   //복사를 해서 사용하는 것이기 때문에 teacher에 영향 X
        System.out.println(calculator.add(2000, 21));
        System.out.println(calculator.result);
        //System.out.println(calculator.sharResult);    // 2021
        //인스턴스끼리 공유하는 값들은 굳이 인스턴스 명을 사용할 필요 없이 바로 클래스에서 접근이 가능
        //System.out.println(teacher.sharResult); 로 해도 상관이 없음

        System.out.println(teacher.result); // 4
        //System.out.println(teacher.sharResult);   // 2021

        System.out.println(Calculator.SHARE_BITRHDAY);
    }
}
