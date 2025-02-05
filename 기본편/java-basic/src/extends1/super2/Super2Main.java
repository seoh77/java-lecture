package extends1.super2;

/*
    정리
    - 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다. 따라서 부모의 데이터를 먼저 초기화하고 그 다음에 자식의 데이터를 초기화한다.
    - 상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 `super()`를 호출해야 한다. 단, 기본 생성자(`super()`)인 경우 생략할 수 있다.
 */

public class Super2Main {

    public static void main(String[] args) {
        // 실행해보면 ClassA -> ClassB -> ClassC 순서로 실행된다. 즉, 생성자의 실행 순서가 결과적으로 최상위 부모부터 실행되어서 하나씩 아래로 내려온다.
        // 따라서, 초기화는 최상위 부모부터 이루어진다. 왜냐하면 자식 생성자의 첫줄에서 부모의 생성자를 호출해야 하기 때문이다.
        ClassC classC = new ClassC();

        ClassB classB = new ClassB(100);
    }
}
