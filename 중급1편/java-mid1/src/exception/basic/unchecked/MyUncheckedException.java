package exception.basic.unchecked;

/*
    체크 예외 vs 언체크 예외
    - 체크 예외 : 예외를 잡아서 처리하지 않으면 항상 `throws` 키워드를 사용해서 던지는 예외를 선언해야 한다.
    - 언체크 예외 : 말 그대로 컴파일러가 예외를 체크하지 않는다는 뜻으로, 예외를 잡아서 처리하지 않아도 `thorws` 키워드를 생략할 수 있다.

    언체크 예외의 장단점
    - 장점 : 신경쓰고 싶지 않은 언체크 예외를 무시할 수 있다.
            체크 예외의 경우 처리할 수 없는 예외를 밖으로 던지려면 항상 throws 예외를 선언해야 하지만, 언체크 예외는 이 부분을 생략할 수 있다.
    - 단점 : 언체크 예외는 개발자가 실수로 예외를 누락할 수 있다. 반면에 체크 예외는 컴파일러를 통해 예외 누락을 잡아준다.
 */

/**
 * RuntimeException을 상속받은 예외는 언체크 예외가 된다.
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
