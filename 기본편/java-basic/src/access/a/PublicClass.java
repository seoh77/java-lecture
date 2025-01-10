package access.a;

/*
    클래스 레벨의 접근 제어자 규칙
    - 클래스 레벨의 접근 제어자는 `public`, `default` 만 사용할 수 있다.
      -> `private`, `protected` 는 사용할 수 없다.
    - `public` 클래스는 반드시 파일명과 이름이 같아야 한다.
       - 하나의 자바 파일에 `public` 클래스는 하나만 등장할 수 있다.
       - 하나의 자바 파일에 `default` 접근 제어자를 사용하는 클래스는 무한정 만들 수 있다.
 */

// 이 클래스는 `public` 접근 제어자이므로 파일명과 클래스의 이름이 반드시 같아야 한다.
// 이 클래스는 `public` 이기 때문에 외부에서 접근할 수 있다.
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();    // 자기 자신의 클래스를 생성
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

// DefaultClass1, DefaultClass2는 `default` 접근 제어자다.
// 이 클래스는 `default` 이기 때문에 같은 패키지 내부에서만 접근할 수 있다.
class DefaultClass1 {

}

class DefaultClass2 {

}