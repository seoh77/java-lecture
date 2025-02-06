package poly.basic;

/*
    `instanceof` 키워드는 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true를 반환
     => 쉽게 이야기해서 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입을 들어갈 수 있는지 대입해보면 된다.

     new Parent() instanceof Parent
     Parent p = new Parent();   // 같은 타입 true

     new Child() instanceof Parent
     Parent p = new Child()     // 부모는 자식을 담을 수 있으므로 true

     new Parent() instanceof Child
     Child c = new Parent()     // 자식은 부모를 담을 수 없으므로 false

     new Child() instanceof Child
     Child c = new Child()      // 같은 타입 true
 */

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parnet1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parnet2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // 다운캐스팅을 수행하기 전에 먼저 `instanceof`를 사용해서 원하는 타입으로 변경이 가능한지 확인한 다음에 다운캐스팅을 수행하는 것이 안전함
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
