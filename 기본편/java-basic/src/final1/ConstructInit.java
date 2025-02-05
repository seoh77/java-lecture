package final1;

public class ConstructInit {

    final int value;

    // final을 필드에 사용할 경우 해당 필드는 생성자를 통해서 한 번만 초기화될 수 있다.
    public ConstructInit(int value) {
        this.value = value;
    }
}
