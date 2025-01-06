package class1;

// 두 명의 학생 정보를 출력하는 프로그램 작성 (변수 사용)
public class ClassStart1 {

    // 해당 코드의 문제점
    //  : 학생이 늘어날 때마다 변수를 추가로 선언해야 하고, 출력하는 코드도 추가해야 한다.

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        String student3Name = "학생3";
        int student3Age = 17;
        int student3Grade = 70;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
        System.out.println("이름:" + student3Name + " 나이:" + student3Age + " 성적:" + student3Grade);
    }
}
