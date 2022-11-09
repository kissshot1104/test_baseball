package baseball.domain;

import baseball.domain.Judgment;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        //볼의 개수를 먼저 구한 뒤
        //스트라이크의 개수를 구해 뺸다.
        //남은 수의 볼의 개수다
        int strike = 0;
        Judgment judgment = new Judgment();
        int correctCount = judgment.correctCount(computer, player);

        for (int placeIndex = 0; placeIndex < computer.size(); placeIndex++) {
            if (judgment.hasPlace(computer, placeIndex, player.get(placeIndex))) {
                strike++;
            }
        }
        int ball = correctCount - strike;
        //if (ball != 0)
        return ball + " 볼 " + strike + " 스트라이크";
    }
}
