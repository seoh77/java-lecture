package generic.ex5;

/*
    타입 이레이저
    : 제네릭은 자바 컴파일 단계에서만 사용되고, 컴파일 이후에는 제네릭 정보가 삭제된다. 제네릭에 사용한 타입 매개변수가 모두 사라지는 것이다.
      쉽게 이야기해서 컴파일 전인 `.java`에는 제네릭의 타입 매개변수가 존재하지만, 컴파일 이후인 자바 바이트코드 `.class`에는 타입 매개변수가 존재하지 않는다.

    타입 이레이저 방식의 한계
    : `T`는 런타임에 모두 `Object`가 된다. 따라서 런타임에 타입을 활용하는 `instanceof`, `new T`와 같은 코드는 작성할 수 없다.
 */

public class EraserBox<T> {

    // `instanceof`는 항상 Object와 비교하게 된다. 이렇게 되면 항상 참이 반환되는 문제가 발생한다. 따라서 타입 매개변수에 `instanceof`를 허용X
    public boolean instanceCheck(Object param) {
//        return param instanceof T;    // 오류
        return false;
    }

    // `new T`는 항상 `new Object`가 되어 개발자가 의도한 것과 다르다. 따라서 타입 매개변수에 `new`를 허용X
    public void create() {
//        return new T(); // 오류
    }
}
