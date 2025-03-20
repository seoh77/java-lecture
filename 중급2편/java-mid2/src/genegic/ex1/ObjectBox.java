package genegic.ex1;

public class ObjectBox {

    // 다형성을 활용한 덕에 코드의 중복을 제거하고, 기존 코드를 재사용할 수 있게 되었다.
    // 하지만 입력할 때 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생한다.
    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}
