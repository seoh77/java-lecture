package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        // 이렇게 작성해도 서버 연결 해제에 성공한다.
        // => 하지만 catch에서 잡지 않는 예외가 발생하는 경우 문제가 생긴다.
        client.disconnect();
    }
}
