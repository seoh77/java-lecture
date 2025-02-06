package poly.basic;

// 부모 타입으로 변환하는 경우에는 아래와 같이 캐스팅 코드인 (타입)을 생략할 수 있다.
// 업캐스팅은 생략할 수 있다. 하지만 다운캐스팅은 생략할 수 없다.
// 참고로 업캐스팅은 매우 자주 사용하기 때문에 생략을 권장한다.
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;    // 원래는 (Parent)를 붙여야 하지만 업캐스팅은 생략 가능하다. -> 생략 권장
        Parent parent2 = child;             // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
