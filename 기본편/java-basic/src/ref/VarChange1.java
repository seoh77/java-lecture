package ref;

public class VarChange1 {

    /* 대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다.
        - 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입
        - 참조형이면 변수에 들어 있는 참조값을 복사해서 대입
     */

    public static void main(String[] args) {

        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
