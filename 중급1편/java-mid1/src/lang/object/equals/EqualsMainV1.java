package lang.object.equals;

/*
    자바에서의 "두 객체가 같다"를 나타내는 표현 2가지
    1. 동일성(Identity) : `==` 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    2. 동등성(Equality) : `equals()` 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인

    => "동일"은 완전히 같음을 의미한다. 반면 "동등"은 같은 가치나 수준을 의미하지만 그 형태나 외관 등이 완전히 같지는 않을 수 있다.
       쉽게 이야기해서 동일성은 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인하는 것이고, 동등성은 논리적으로 같은지 확인하는 것이다.
 */

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));       // false
        System.out.println("identity = " + (user1.equals(user2)));  // false -> Object가 기본으로 제공하는 `equals()`는 `==`으로 동일성 비교를 제공
    }
}
