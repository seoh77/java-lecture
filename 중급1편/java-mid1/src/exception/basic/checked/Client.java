package exception.basic.checked;

public class Client {

    // throws 예외는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드
    public void call() throws MyCheckedException {
        // 문제 상황 발생
        throw new MyCheckedException("ex");     // => 예외도 객체이기 때문에 객체를 먼저 `new`로 생성하고 예외를 발생시켜야 한다.
    }
}
