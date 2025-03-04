package time;

/*
    `LocalDate` : 날짜만 표현할 때 사용. 년, 월, 일을 다룬다.  ex) 2025-03-04
    `LocalTime` : 시간만을 표현할 때 사용. 시, 분, 초를 다룬다.  ex) 14:28:30.213
        - 초는 밀리초, 나노초 단위로 포함할 수 있다.
    `LocalDateTime` : `LocalDate` 와 `LocalTime`을 합한 개념이다.   ex) 2025-03-04T14:28:30.213

    => 앞에 `Local`이 붙는 이유는 세계 시간대를 고려하지 않아서 타임존이 적용되지 않기 때문이다.
       특정 지역의 날짜와 시간만 고려할 때 사용한다.
 */

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 = " + nowDate);

        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산 (불변 조심!)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + ofDate);
    }
}
