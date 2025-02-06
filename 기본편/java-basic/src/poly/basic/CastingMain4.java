package poly.basic;

/*
    업캐스팅이 안전하고 다운캐스팅이 위험한 이유
    : 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 함께 생성된다.
      따라서 위로만 타입을 변경하는 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 항상 안전하다.
      반면에 다운캐스팅의 경우 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있다.
      왜냐하면 객체를 생성하면 부모 타입은 모두 함께 생성되지만 자식 타입은 생성되지 않는다.
      따라서 개발자가 이런 문제를 인지하고 사용해야 한다는 의미로 명시적으로 캐스팅을 해주어야 한다.
*/

public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();   // -> 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // -> 런타임 오류 (ClassCastException 발생)
        child2.childMethod();   // 실행 불가
    }
}
