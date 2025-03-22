package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다.
    // => 하지만 이렇게 모호한 것은 좋지 않다. 둘의 이름이 겹치면 하나를 다른 이름으로 변경하는 것이 좋다.
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
