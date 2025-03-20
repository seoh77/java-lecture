package generic.ex1;

/*
    제네릭
    - `<>`를 사용한 클래스를 제네릭 클래스라고 한다.
       +) `<>` 이 기호를 보통 다이아몬드라고 한다.
    - 제네릭 클래스를 사용할 때는 `Integer`, `String` 같은 타입을 미리 결정하지 않는다.
    - 대신에 클래스명 오른쪽에 `<T>`와 같이 선언하면 제네릭 클래스가 된다.
      여기서 `T`를 타입 매개변수라 한다. 이 타입 매개변수는 이후에 `Integer`, `String` 같은 타입으로 변할 수 있다.
    - 그리고 클래스 내부에 `T` 타입이 필요한 곳에 `T value`와 같이 타입 매개변수를 적어두면 된다.

    용어 정리
    1. 제네릭(Generic) 단어
        - 제네릭이라는 단어는 일반적인, 범용적인이라는 영어 단어 뜻이다.
        - 풀어보면 특정 타입에 속한 것이 아니라 일반적으로, 범용적으로 사용할 수 있다는 뜻이다.
    2. 제네릭 타입 (Generic Type)
        - 클래스나 인터페이스를 정의할 때 타입 매개변수를 사용하는 것을 말한다.
        - 제네릭 클래스, 제네릭 인터페이스를 모두 합쳐서 제네릭 타입이라 한다.
          => 타입은 클래스, 인터페이스, 기본형(int 등)을 모두 합쳐서 부르는 말이다.
        - 예: `class GenericBox<T> { private T t; }`
          => 여기에서 `GenericBox<T>`를 제네릭 타입이라 한다.
    3. 타입 매개변수 (Type parameter)
        - 제네릭 타입이나 메서드에서 사용되는 ㅂ녀수로, 실제 타입으로 대체된다.
        - 예: `GenericBox<T>`
          => 여기에서 `T`를 타입 매개변수라 한다.
    4. 타입 인자 (Type Argument)
        - 제네릭 타입을 사용할 때 제공되는 실제 타입이다.
        - 예: `GenericBox<Integer>`
          => 여기에서 `Integer`를 타입 인자라 한다.

    제네릭 명명 관례
    - 타입 매개변수는 일반적인 변수명처럼 소문자로 사용해도 문제는 없다.
    - 하지만 일반적으로 대문자를 사용하고 용도에 맞는 단어의 첫글자를 사용하는 관례를 따른다.
    - 주로 사용하는 키워드
      E(Element), K(Key), N(Number), T(Type), V(Value), S, U, V, etc, ...
    - 한 번에 여러 타입 매개변수를 선언할 수 있다.
      예: `class Data<K, V> { }
    - 타입 인자로 기본형(int, double 등)은 사용할 수 없다. 대신에 래퍼 클래스(Integer, Double)를 사용하면 된다.
 */

public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
