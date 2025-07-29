package collection.deque;

import java.util.Stack;

/*
    주의! Stack 클래스는 사용하지 말자
    자바의 Stack 클래스는 내부에서 Vector 라는 자료 구조를 사용한다. 이 자료 구조는 현재는 사용되지 않고 하위 호환을 위해 존재한다.
    지금은 더 빠른 좋은 자료 구조가 많다. 따라서 Vector를 사용하는 Stack도 사용하지 않는 것을 권장한다.
    대신에 `Deque`를 사용하는 것이 좋다.
 */

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인 (꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }
}
