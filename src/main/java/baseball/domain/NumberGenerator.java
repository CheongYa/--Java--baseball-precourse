package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    //List = java에서 기본적으로 제공해주는 기능
    public List<Integer> createRandomNumbers() {
        //3개의 숫자가 담길 때까지
        //만약 이미 존재하는 숫자라면 담지 않는다.
        //만약 존재하지 않는 숫자라면 담는다.
        List<Integer> numbers = new ArrayList<>();  //ArrayList = List의 실제 클래스
        while (numbers.size() < 3) {    //size = 몇 개가 담겼는지
            int number = new Random().nextInt(9) + 1;   //0부터 8까지 -> 1부터 9까지
            if (numbers.contains(number)) {     //contains = 함유, 가지고 있는지
                continue;
            } else {
                numbers.add(number);
            }
        }

        return numbers;
    }
}
