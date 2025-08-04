package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        // `List.of()`를 사용하면 컬렉션을 편리하게 생성할 수 있다. 단, 이때는 가변이 아니라 불변 컬렉션이 생성된다.
        // List, Set, Map 모두 `of()` 메서드를 지원한다.
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        System.out.println("list class = " + list.getClass());
        System.out.println("set class = " + set.getClass());
        System.out.println("map class = " + map.getClass());

//        list.add(4);    // => java.lang.UnsupportedOperationException 예외 발생
    }
}
