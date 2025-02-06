package poly.basic;

/*
    캐스팅
    - 업캐스팅(upcasting) : 부모 타입으로 변경
    - 다운캐스팅(downcasting) : 자식 타입으로 변경
 */

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();

        // 단, 자식의 기능은 호출할 수 없다 -> 컴파일 오류 발생
        // poly.childMethod();

        // 다운캐스팅 (부모타입 -> 자식타입)
        // 괄호와 그 사이에 타입을 지정하면 참조 대상을 특정 타입으로 변경할 수 있다.
        // 캐스팅 한다고 해서 `Parent poly`의 타입이 변하는 것은 아니다. 해당 참조값을 꺼내고 꺼낸 참조값이 `Child` 타입이 되는 것이다.
        Child child = (Child) poly;
        child.childMethod();
    }
}
