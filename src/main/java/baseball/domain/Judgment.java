package baseball.domain;

import java.util.List;

public class Judgment {
    public int correctCount(List<Integer> computer, List<Integer> player){
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            int playNumber = player.get(i);
            if (computer.contains(playNumber)) {
                result++;   //result = result + 1
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int place, int number) {
        return false;
    }
}
