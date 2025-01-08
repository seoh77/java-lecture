package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        /*
          this 사용 이유
          : 코드를 보면 메서드의 매개변수에 정의한 이름과 MemberInit 클래스의 멤버 변수의 이름이 똑같다.
            이 경우 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다.
            따라서 해당 메서드 안에서 `name` 이라고 적으면 매개변수에 접근하게 된다.
            이때 멤버 변수에 접근하려면 앞에 `this.` 라고 해주면 된다. 여기서 `this`는 인스턴스 자신의 참조값을 가리킨다.
         */
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
