package nested.nested.ex2;

// 정적 중첩 클래스로 리팩토링
public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // NetworkMessage의 접근 제어자를 `private`으로 설정하여 외부에서 NetworkMessage에 접근할 수 없도록 설정
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
