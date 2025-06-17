package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);     // 중복을 제외한 모든 요소 추가

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);   // 겹치는 것만 남기고 나머지는 제거

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);     // 요소 제거

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);
    }
}
