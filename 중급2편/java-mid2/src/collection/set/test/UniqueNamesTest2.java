package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        // 직접 배열을 반복하면서 Set에 입력하는 방법
        /*
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }
         */

        // 배열을 리스트로 변환해서 set 생성자에 전달 <- 더 간단함!
        // 자바 9 이상부터는 `Arrays.asList()`보다 `List.of()` 사용을 권장
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
