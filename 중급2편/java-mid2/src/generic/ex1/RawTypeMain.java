package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        // 제네릭 타입을 사용할 때는 항상 `<>`를 사용해서 사용시점에 원하는 타입을 지정해야 한다.
        // 그런데 아래와 같이 `<>`를 지정하지 않을 수 있는데, 이런 것을 로 타입(raw type) 또는 원시 타입이라 한다.
        // 원시타입을 사용하면 내부의 타입 매개변수가 `Object`로 사용된다고 이해하면 된다.
        GenericBox integerBox = new GenericBox();   // 아래와 같은 의미
        // GenericBox<Object> integerBox = new GenericBox<>(); // => 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
