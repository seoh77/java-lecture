package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        // `values()` : 모든 ENUM 상수를 포함하는 배열을 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        // `name()` : ENUM 상수의 이름을 문자열로 반환
        // `ordinal()` : ENUM 상수의 선언 순서(0부터 시작)를 반환 -> 가급적 사용하지 않는 것이 좋다
        // `toString()` : ENUM 상수의 이름을 문자열로 반환한다. `name()` 메서드와 유사하지만, `toString()`은 직접 오버라이드할 수 있다.
        for(Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // `valueOf(String name)` : 주어진 이름과 일치하는 ENUM 상수를 반환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
