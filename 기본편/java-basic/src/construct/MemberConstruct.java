package construct;

/*
    생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
     - 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
     - 생성자는 반환 타입이 없다. 비워두어야 한다.
 */

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // MemberConstruct 생성자 추가 (오버로딩)
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;

        /* 위의 코드를 아래로 변경하여 중복 부분 제거
          - `this()` 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다. 여기서 `this`는 인스턴스 자신의 참조값을 가리킨다.
          - `this()` 는 생성자 코드의 첫줄에만 작성할 수 있다. -> 첫번째 줄이 아닌 경우 컴파일 오류 발생
         */
        this(name, age, 50);
    }
}
