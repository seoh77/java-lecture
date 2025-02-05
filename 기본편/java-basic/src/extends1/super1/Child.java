package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);   // this 생략 가능
        System.out.println("super value = " + super.value);

        this.hello();   // this 생략 가능
        super.hello();

        // => 필드 이름과 메서드 이름이 같지만 `super`를 사용해서 부모 클래스에 있는 기능을 사용할 수 있다.
    }
}
