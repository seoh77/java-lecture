package poly.ex5;

/*
    인터페이스를 사용할 때는 extends 대신 implements 키워드 사용

    상속 vs 구현
    : 부모 클래스의 기능을 자식 클래스가 상속 받을 때 클래스는 상속 받는다고 표현하지만,
      부모 인터페이스의 기능을 자식이 상속 받을 때는 인터페이스를 구현한다고 표현한다.
      상속은 이름 그대로 부모의 기능을 물려 받는 것이 목적이다. 하지만 인터페이스는 모든 메서드가 추상 메서드이다.
      따라서 물려받을 수 있는 기능이 없고, 오히려 인터페이스에 정의한 모든 메서드를 자식이 오버라이딩 해서 기능을 구현해야 한다.
      인터페이스는 메서드 이름만 있는 설계도이고, 이 설계도가 실제 어떻게 작동하는지는 하위 클래스에서 모두 구현해야 한다.
      따라서 인터페이스의 경우 상속이 아니라 해당 인터페이스를 구현한다고 표현한다.
 */

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동");
    }
}
