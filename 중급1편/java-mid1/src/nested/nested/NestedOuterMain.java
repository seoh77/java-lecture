package nested.nested;

public class NestedOuterMain {

    /*
        - 정적 중첩 클래스는 `new 바깥클래스.중첩클래스()`로 생성할 수 있다.
        - 중첩 클래스는 `NestedOuter.Nested`와 같이 `바깥 클래스.중첩클래스`로 접근할 수 있다.
        - 여기서 `new NestedOuter()`로 만든 바깥 클래스의 인스턴스와 `new NestedOuter.Nested()`로 만든
          정적 중첩 클래스의 인스턴스는 서로 아무 관계가 없는 인스턴스이다. 단지 클래스 구조상 중첩해 두었을 뿐이다.
          => 둘이 아무런 관련이 없으므로 정적 중첩 클래스의 인스턴스만 따로 생성해도 된다.
     */

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();

        // 정적 중첩 클래스는 바깥 클래스의 정적 필드에는 접근할 수 있다.
        // 하지만 바깥 인스턴스의 참조가 없기 때문에 바깥 클래스가 만든 인스턴스 필드에는 바로 접근할 수 없다.
        nested.print();

        // 중첩 클래스를 출력해보면 중첩 클래스의 이름은 `NestedOuter$Nested`와 같이 바깥 클래스, $, 중첩 클래스의 조합으로 만들어진다.
        System.out.println("nestedClass = " + nested.getClass());
    }
}
