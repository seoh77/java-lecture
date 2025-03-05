package nested.nested;

/*
    중첩 클래스 (Nested Class)
     - 정적 중첩 클래스
       - 정적 변수와 같이 앞에 `static`이 붙어있다.
       - 바깥 클래스의 인스턴스에 소속되지 않는다.
     - 내부 클래스 : 내부 클래스, 지역 클래스, 익명 클래스
       - 인스턴스 변수와 같이 앞에 `static`이 붙지 않는다.
       - 바깥 클래스의 인스턴스에 소속된다.

    중첩 클래스를 사용하는 이유
     - 논리적 그룹화 : 특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우 해당 클래스 안에 포함하는 것이 논리적으로 더 그룹화된다.
       패키지를 열었을 때 다른 곳에서 사용될 필요가 없는 중첩 클래스가 외부에 노출되지 않는 장점도 있다.
     - 캡슐화 : 중첩 클래스의 바깥 클래스의 `private` 멤버에 접근할 수 있다. 이렇게 해서 둘을 긴밀하게 연결하고 불필요한 `public` 메서드를 제거할 수 있다.
 */

/*
    정리
    : 정적 중첩 클래스는 사실 다른 클래스를 그냥 중첩해 둔 것일 뿐이다! 쉽게 이야기해서 둘은 아무런 관계가 없다.
      `NestedOuter.outClassValue`와 같은 정적 필드에 접근하는 것은 중첩 클래스가 아니어도 어차피 `클래스명.정적필드명`으로 접근할 수 있다.
       쉽게 이야기해서 정적 중첩 클래스를 만들지 않고, 그냥 클래스 2개를 따로 만든 것과 같다.
       다만 클래스를 따로 만든 것과 중첩 클래스의 유일한 차이는 같은 클래스에 있으니 `private` 접근 제어자에 접근할 수 있다는 것이다.
 */

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        // `private` 접근 제어자는 같은 클래스 안에 있을 때만 접근할 수 있다.
        // 중첩 클래스도 바깥 클래스와 같은 클래스 안에 있다. 따라서 중첩 클래스는 바깥 클래스의 `private` 접근 제어자에 접근할 수 있다.
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버 -> 접근 가능
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버 -> 접근 불가
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버 -> 접근 가능, private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
            // System.out.println(outClassValue);  // -> 줄여서도 사용 가능
        }
    }
}
