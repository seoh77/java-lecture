package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    데이터를 추가할 때 자바 ArrayList가 직접 구현한 MyArrayList보다 빠른 이유
    - 자바의 배열 리스트는 이때 메모리 고속 복사를 사용하기 때문에 성능이 최적화된다.
    - 메모리 고속 복사는 시스템에 따라 성능이 다르기 때문에 정확한 계산은 어렵지만 대략 O(n/10)정도로 추정하고, 상수를 제거하면 o(n)이 된다.
      하지만 메모리 고속 복사라도 데이터가 아주 많으면 느려진다.

    시간 복잡도와 실제 성능
    - 이론적으로 LinkedList의 중간 삽입 연산은 ArrayList보다 빠를 수 있다.
      그러나 실제 성능은 요소의 순차적 접근 속도, 메모리 할당 및 해제 비용, CPU 캐시 활용도 등 다양한 요소에 의해 영향을 받는다.
      +) 추가로 ArrayList는 데이터를 한 칸씩 직접 이동하지 않고, 대신에 메모리 고속 복사를 사용한다.
    - ArrayList는 요소들이 메모리 상에서 연속적으로 위치하여 CPU 캐시 효율이 좋고, 메모리 접근 속도가 빠르다.
    - 반면, LinkedList는 각 요소가 별도의 객체로 존재하고 다음 요소의 참조를 저장하기 때문에 CPU 캐시 효율이 떨어지고, 메모리 접근 속도가 상대적으로 느려질 수 있다.
    - ArrayList의 경우 CAPACITY를 넘어서면 배열을 다시 만들고 복사하는 과정이 추가된다.
      하지만 한번에 50%씩 늘어나기 때문에 이 과정은 가끔 발생하므로, 전체 성능에 큰 영향을 주지는 않는다.

    => 이론적으로 LinkedList가 중간 삽입에 있어 더 효율적일 수 있지만,
       현대 컴퓨터 시스템의 메모리 접근 패턴, CPU 캐시 최적화, 메모리 고속 복사 등을 고려할 때 ArrayList가 실제 사용 환경에서 더 나은 성능을 보여주는 경우가 많다.
 */

public class JavaListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== ArrayList 추가 ==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);

        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);

        int loop = 10_000;
        System.out.println("== ArrayList 조회 ==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("== ArrayList 검색 ==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println("== LinkedList 추가 ==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);

        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size);

        System.out.println("== LinkedList 조회 ==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("== LinkedList 검색 ==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산시간: " + (endTime - startTime) + "ms");
    }
}
