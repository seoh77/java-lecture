package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();  // 자바5
        List<Integer> list4 = List.of();    // 자바9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        // `Arrays.asList()`로 생성된 리스트는 고정된 크기를 가지지만, 요소들은 변경할 수 있다.
        // `set()`을 통해 요소를 변경할 수 있고, `add()`, `remove()` 같은 메서드를 호출하면 예외가 발생한다.
        //  => 하지만 일반적으로 `List.of()`를 사용하는 것을 권장한다.
        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);
        arrList.set(0, 100);    // 주의! arrList의 값을 변경했는데 arr 배열의 값도 같이 변경된다.
        System.out.println("arr = " + Arrays.toString(arr));    // arr = [100, 2, 3, 4, 5]
        System.out.println("arrList = " + arrList);     // arrList = [100, 2, 3, 4, 5]
    }
}
