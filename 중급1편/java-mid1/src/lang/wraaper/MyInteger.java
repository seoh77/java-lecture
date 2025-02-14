package lang.wraaper;

// int 값을 가지고 클래스로 만들기
// -> 이렇게 특정 기본형을 감싸서(Wrap) 만드는 클래스를 래퍼 클래스(Wrapper Class)라고 한다.
public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // MyIntegerMethodMain0에서 만들었던 `compareTo()` 메서드를 클래스 내부로 캡슐화
    public int compareTo(int target) {
        if(value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
