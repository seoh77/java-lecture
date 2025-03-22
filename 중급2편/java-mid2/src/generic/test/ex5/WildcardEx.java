package generic.test.ex5;

import generic.animal.Animal;

/*
    참고!
    - 와일드카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다.
    - 와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.

    제네릭 메서드 vs 와일드카드
    제네릭 메서드에는 타입 매개변수가 존재한다. 그리고 특정 시점에 타입 매개변수에 타입 인자를 전달해서 타입을 결정해야 한다.
    반면에 와일드카드는 일반적인 메서드에 사용할 수 있고, 단순히 매개변수로 제네릭 타입을 받을 수 있는 것 뿐이다.
    제네릭 메서드처럼 타입을 결정하거나 복잡하게 작동하지 않는다. 단순히 일반 메서드에 제네릭 타입을 받을 수 있는 매개변수가 하나 있는 것 뿐이다.
    따라서, 제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드카드 사용을 권장한다.
 */

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 와일드카드인 `?`는 모든 타입을 다 받을 수 있다는 뜻 (Box<Dog>, Box<Cat>, Box<Object> 다 들어올 수 있음)
    // => 이렇게 `?`만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드카드를 비제한 와일드카드라 한다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
