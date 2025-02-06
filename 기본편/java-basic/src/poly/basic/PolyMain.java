package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        // => 부모 타입은 자식 타입을 담을 수 있다. 만약 손자가 있다면 손자도 가능하다.
        // => 자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
        // => 다양한 형태를 참조할 수 있다고 해서 다형적 참조라고 한다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 자식의 기능은 호출할 수 없다. (컴파일 오류 발생)
        // => 이런 경우 자식의 기능을 사용하고 싶다면 "캐스팅"이 필요!
//        poly.childMethod();

        // 반대로 자식 타입은 부모 타입을 담을 수 없다. (컴파일 오류 발생)
//        Child child1 = new Parent();
    }
}
