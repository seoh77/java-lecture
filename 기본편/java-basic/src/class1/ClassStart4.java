package class1;

// 두 명의 학생 정보를 출력하는 프로그램 작성 (Class + 배열 사용)
public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // Student를 담을 수 있는 배열을 생성한 후, 해당 배열에 student1, student2 인스턴스를 보관
        // 주의! 변수에는 인스턴스 자체가 들어있는 것이 아니라 인스턴스의 위치를 가리키는 참조값이 들어있다.
        Student[] students = new Student[2];    // 배열에는 아직 참조값을 대입하지 않았기 때문에 `null` 값으로 초기화된다.
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
