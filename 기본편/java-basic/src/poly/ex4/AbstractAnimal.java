package poly.ex4;

/*
    순수 추상 클래스 : 모든 메서드가 추상 메서드인 클래스
    -> 이러한 순수 추상 클래스는 실행 로직을 전혀 가지고 있지 않다. 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.

    특징
    - 인스턴스를 생성할 수 없다.
    - 상속시 자식은 모든 메서드를 오버라이딩 해야 한다.
    - 주로 다형성을 위해 사용된다.

    => 자바는 순수 추상 클래스를 더 편리하게 사용할 수 있도록 "인터페이스" 라는 개념을 제공한다.
 */

public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();
}
