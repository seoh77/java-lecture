package extends1.overriding;

/*
    오버로딩(Overloading)과 오버라이딩(Overriding)
    - 메서드 오버로딩 : 메서드 이름이 같고 파라미터가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩이라 한다.
      오버로딩은 번역하면 과적인데, 과하게 물건을 담았다는 뜻이다. 따라서 같은 이름의 메서드를 여러개 정의했다고 이해하면 된다.
    - 메서드 오버라이딩 : 메서드 오버라이딩은 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정을 의미한다.
      따라서 상속 관계에서 사용한다. 부모의 기능을 자식이 다시 정의하는 것이다.
      오버라이딩을 단순히 해석하면 무언가를 넘어서 타는 것을 말한다. 자식의 새로운 기능이 부모의 기존 기능을 넘어 타서 기존 기능을 새로운 기능으로 덮어버린다고 이해하면 된다.

    메서드 오버라이딩 조건
    - 메서드 이름 : 메서드 이름이 같아야 한다.
    - 메서드 매개변수(파라미터) : 매개변수(파라미터) 타입, 순서, 개수가 같아야 한다.
    - 반환 타입 : 반환 타입이 같아야 한다. 단, 반환 타입이 하위 클래스 타입일 수 있다.
    - 접근 제어자 : 오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안된다.
      예를 들어, 상위 클래스의 메서드가 `protected` 로 선언되어 있으면 하위 클래스에서 이를 `public` 또는 `protected`로 오버라이드할 수 있지만,
      `private` 또는 `default`로 오버라이드 할 수 없다.
    - 예외 : 오버라이딩 메서드는 상위 클래스의 메서드보다 더 많은 예외를 throws로 선언할 수 없다.
      하지만 더 적거나 같은 수의 예외, 또는 하위 타입의 예외는 선언할 수 있다.
    - `static`, `final`, `private` 키워드가 붙은 메서드는 오버라이딩 될 수 없다.
       - `static`은 클래스 레벨에서 작동하므로 인스턴스 레벨에서 사용하는 오버라이딩이 의미가 없다. 쉽게 이야기해서 그냥 클래스 이름을 통해 필요한 곳에 직접 접근하면 된다.
       - `final` 메서드는 재정의를 금지한다.
       - `private` 메서드는 해당 클래스에서만 접근 가능하기 때문에 하위 클래스에서 보이지 않는다. 따라서 오버라이딩 할 수 없다.
    - 생성자 오버라이딩 : 생성자는 오버라이딩 할 수 없다.
 */

public class ElectricCar extends Car {

    @Override   // 부모의 기능을 자식이 새로 재정의 하는 것 : 오버라이딩
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
