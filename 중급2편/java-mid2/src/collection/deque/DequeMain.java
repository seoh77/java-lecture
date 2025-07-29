package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {
        // Deque의 대표적인 구현체는 `ArrayDeque`와 `LinkedList`가 있다. 이 중에 `ArrayDeque`가 모든 면에서 더 빠르다.
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);  // [1]
        deque.offerFirst(2);
        System.out.println(deque);  // [2, 1]
        deque.offerLast(3);
        System.out.println(deque);  // [2, 1, 3]
        deque.offerLast(4);
        System.out.println(deque);  // [2, 1, 3, 4]

        // 다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
    }
}
