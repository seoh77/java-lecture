package nested.local;

/*
    지역 클래스(Local Class)
    - 지역 클래스는 지역 변수처럼 코드 블럭 안에 클래스를 선언한다.
    - 지역 클래스는 지역 변수에 접근할 수 있다.
    - 지역 클래스는 지역 변수처럼 접근 제어자를 사용할 수 없다.
 */

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printDate() {
                // 자신의 인스턴스 변수인 `value`에 접근할 수 있다.
                System.out.println("value = " + value);

                // 자신이 속한 코드 블럭의 지역 변수인 `localVar`에 접근할 수 있다.
                System.out.println("localVar = " + localVar);

                // 자신이 속한 코드 블럭의 매개변수인 `paramVar`에 접근할 수 있다.
                // +) 참고로 매개변수도 지역 변수의 한 종류이다.
                System.out.println("paramVar = " + paramVar);

                // 바깥 클래스의 인스턴스 멤버인 `outInstanceVar`에 접근할 수 있다. (지역 클래스도 내부 클래스의 한 종류)
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printDate();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
