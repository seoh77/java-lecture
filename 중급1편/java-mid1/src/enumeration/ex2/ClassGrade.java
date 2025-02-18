package enumeration.ex2;

public class ClassGrade {

    // 회원 등급을 다루는 클래스를 만들고, 각각의 회원 등급별로 상수로 선언
    // 각각의 상수마다 별도의 인스턴스를 생성하고, 생성한 인스턴스를 대입
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 외부에서 임의로 ClassGrade 인스턴스를 생성할 수 있다는 문제가 있으므로 외부에서 `ClassGrade`를 생성할 수 없도록 막아야 한다.
    // => private 생성자 추가
    private ClassGrade() {}
}
