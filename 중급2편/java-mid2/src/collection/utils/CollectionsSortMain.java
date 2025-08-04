package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);    // 정렬 기준으로 최대값을 찾아서 반환
        Integer min = Collections.min(list);    // 정렬 기준으로 최소값을 찾아서 반환
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);
        Collections.shuffle(list);  // 컬렉션을 랜덤하게 섞는다.
        System.out.println("shuffle list = " + list);

        Collections.sort(list);     // 정렬 기준으로 컬렉션을 정렬한다.
        System.out.println("sort list = " + list);
        Collections.reverse(list);  // 정렬 기준의 반대로 컬렉션을 정렬한다.
        System.out.println("reverse list = " + list);
    }
}
