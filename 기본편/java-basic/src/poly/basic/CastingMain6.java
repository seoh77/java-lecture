package poly.basic;

// 자바 16부터는 `instanceof`를 사용하면서 동시에 변수를 선언할 수 있다.
public class CastingMain6 {

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

        // Child 인스턴스의 경우 childMethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
