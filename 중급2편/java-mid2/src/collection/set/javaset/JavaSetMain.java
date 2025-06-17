package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>());   // A 1 B 2 C -> 입력한 순서 보장 X
        run(new LinkedHashSet<>()); // C B A 1 2 -> 입력한 순서 보장 O
        run(new TreeSet<>());   // 1 2 A B C -> 데이터 값을 기준으로 정렬 O
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {    // `iterator.hasNext()` : 다음 데이터가 있는지 확인
            System.out.print(iterator.next() + " ");    // `iterator.next()` : 다음 데이터를 반환
        }
        System.out.println();
    }
}
