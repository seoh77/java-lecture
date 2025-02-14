package lang.wraaper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);   // 미래에 삭제 예정, 대신에 `valueOf()`를 사용
        Integer integerObj = Integer.valueOf(10);   // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변, 더 효율적
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        // `intValue()` : 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메서드
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        // 래퍼 클래스는 객체이기 때문에 `==` 비교를 하면 인스턴스의 참조값을 비교한다.
        // 래퍼 클래스는 내부의 값을 비교하도록 `equals()`를 재정의 해두었다. 따라서 값을 비교하려면 `equals()`를 사용해야 한다.
        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
