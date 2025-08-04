package collection.compare;

import java.util.Arrays;

public class SortMain1 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);     // `Arrays.sort()`를 사용하면 배열에 들어있는 데이터를 순서대로 정렬
        System.out.println(Arrays.toString(array));
    }
}
