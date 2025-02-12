package lang.immutable.address;

/*
    불변 객체
     : 객체의 상태(객체 내부의 값, 필드, 멤버 변수)가 변하지 않는 객체
       => 사이드 이펙트가 발생하면 안되는 상황이라면 불변 객체를 만들어 사용하면 된다.
 */

public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
