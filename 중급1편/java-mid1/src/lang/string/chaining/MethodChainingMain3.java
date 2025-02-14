package lang.string.chaining;

/*
    메서드 체이닝
    : 메서드 체이닝 방식은 메서드가 끝나는 시점에 바로 `.`을 찍어서 변수명을 생략할 수 있다.
      메서드 체이닝이 가능한 이유는 자기 자신의 참조값을 반환하기 때문이다. 이 참조값에 `.`을 찍어서 바로 자신의 메서드를 호출할 수 있다.
      => 메서드 체이닝 기법은 코드를 간결하고 읽기 쉽게 만들어준다.
 */

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // `add()` 메서드를 호출하면 ValueAdder 인스턴스 자신의 참조값이 반환된다. 이 반환된 참조값을 즉시 사용해서 바로 메서드를 호출할 수 있다.
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);   // result = 6
    }
}
