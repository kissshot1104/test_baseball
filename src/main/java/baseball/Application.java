package baseball;

import baseball.domain.NumberGenerator;
import baseball.domain.Judgment;
import baseball.domain.Referee;

import java.util.List;
import java.util.Arrays;

/*
 * 객체 지향 프로그래밍
 * 1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
 * 2. 필요한 기능을 (역할에 맞는) 인스턴스가 수행하게 한다.(의인화)
 * 3. 각 결과를 종합한다.
 * */

public class Application {
    public static void main(String[] args) {

        final Referee referee = new Referee();
        final String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 1, 2));
        System.out.println(result);

    }
}
