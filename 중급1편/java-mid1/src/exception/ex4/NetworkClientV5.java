package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

/*
    Try with resources 장점
    - 리소스 누수 방지 : 모든 리소스가 제대로 닫히도록 보장한다.
      실수로 `finally` 블록을 적지 않거나, `finally` 블럭 안에서 자원 해제 코드를 누락하는 문제를 예방할 수 있다.
    - 코드 간결성 및 가독성 향상 : 명시적인 `close()` 호출이 필요 없어 코드가 더 간결하고 읽기 쉬워진다.
    - 스코프 범위 한정 : 예를 들어 리소스로 사용되는 `client` 변수의 스코프가 `try` 블럭 안으로 한정된다. 따라서 코드 유지보수가 더 쉬워진다.
    - 조금 더 빠른 자원 해제 : 기존에는 try -> catch -> finally로 catch 이후에 자원을 반납했다.
      Try with resources 구문은 try 블럭이 끝나면 즉시 `close()`를 호출한다.
 */

public class NetworkClientV5 implements AutoCloseable {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if(sendError) {
            throw new SendExceptionV4(data, address +" 서버에 데이터 전송 실패: " + data);
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }

        if(data.contains("error2")) {
            sendError = true;
        }
    }

    /**
     * AutoCloseable 인터페이스가 제공하는 메서드로 `try`가 끝나면 자동으로 호출된다.
     * 종료 시점에 자원을 반납하는 방법을 여기에 정의하면 된다.
     */
    @Override
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
