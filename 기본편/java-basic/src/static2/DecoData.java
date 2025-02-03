package static2;

/*
    정적 메서드 사용법
    - `static` 메서드는 `static`만 사용할 수 있다.
        - 클래스 내부의 기능을 사용할 때, 정적 메서드는 `static` 이 붙은 정적 메서드나 정적 변수만 사용할 수 있다.
        - 클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.
    - 반대로 모든 곳에서 `static`을 호출할 수 있다.
        - 정적 메서드는 공용 기능이다. 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static을 호출할 수 있다.

    정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유
    : 정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다. 그래서 인스턴스처럼 참조값의 개념이 없다.
      특정 인스턴스의 기능을 사용하려면 참조값을 알아야 하는데, 정적 메서드는 참조값 없이 호출한다.
      따라서 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.
 */

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++;    // 인스턴스 변수 접근 <- compile error
//        instanceMethod();   // 인스턴스 메서드 접근 <- compile error

        staticValue++;      // 정적 변수 접근
        staticMethod();     // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;    // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메서드 접근

        staticValue++;      // 정적 변수 접근
        staticMethod();     // 정적 메서드 접근

    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
