package generic.ex4;

/*
    제네릭 메서드
    - 정의: `<T> T genericMethod(T t)`
    - 타입 인자 전달: 메서드를 호출하는 시점
       예) `GenericMethod.<Integer>genericMethod(i)`

    - 제네릭 메서드는 클래스 전체가 아니라 특정 메서드 단위로 제네릭을 도입할 때 사용한다.
    - 제네릭 메서드를 정의할 때는 메서드의 반환 타입 왼쪽에 다이아몬드를 사용해서 `<T>`와 같이 타입 매개변수를 적어준다.
    - 제네릭 메서드는 메서드를 실제 호출하는 시점에 다이아몬드를 사용해서 `<Integer>`와 같이 타입을 정하고 호출한다.
 */

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("generic print: " + obj);
        return obj;
    }

    // 제네릭 메서드도 제네릭 타입과 마찬가지로 타입 매개변수를 제한할 수 있다.
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
