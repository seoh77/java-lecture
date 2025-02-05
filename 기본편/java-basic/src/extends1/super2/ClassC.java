package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        // `ClassC` 의 부모인 `ClassB` 에는 기본 생성자가 없다. 따라서 부모의 기본 생성자를 호출하는 `super()` 를 사용하거나 생략할 수 없다.
        super(10, 20);    // 기본 생성자가 아니기 때문에 직접 정의해줘야 함
        System.out.println("ClassC 생성자");
    }
}
