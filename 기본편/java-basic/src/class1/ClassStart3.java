package class1;

// 두 명의 학생 정보를 출력하는 프로그램 작성 (Class 사용)
public class ClassStart3 {

    /*
     클래스와 사용자 정의 타입
     - 타입은 데이터의 종류나 형태를 나타낸다. 그러면 학생(Student)라는 타입을 만들면 되지 않을까?
     - 클래스를 사용하면 `int`, `String`과 같은 타입을 직접 만들 수 있다.
     - 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요한데, 이 설계도가 '클래스'이다.
     - 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.

     용어 정리
     - 클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다. 둘 다 같은 의미로 사용된다.
     - 여기서는 학생(Student) 클래스를 기반으로 학생1(student1), 학생2(student2) 객체 또는 인스턴스를 만들었다.
     */

    public static void main(String[] args) {
        Student student1;           // 변수 선언 : Student 타입을 받을 수 있는 변수를 선언
        student1 = new Student();   // Student 인스턴스 생성 -> 생성된 Student 인스턴스 참조값 보관 (생성한 객체에 접근하기 위함)
        student1.name = "학생1";      // 클래스를 통해 생성된 객체에 접근하려면 `.` 을 사용하면 된다.
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 참조값 확인
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
