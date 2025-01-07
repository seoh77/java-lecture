package ref;

public class MethodChange1 {

    /*
        자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다. 그러나 이 값이 실제 값이냐, 참조(메모리 주소) 값이냐에 따라 동작이 달라진다.
        - 기본형 : 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다.
                 이 경우 메서드 내부에서 매개변수(파라미터)의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
        - 참조형 : 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다.
                 이 경우 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
     */

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);      // a = 10
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);      // a = 10
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
