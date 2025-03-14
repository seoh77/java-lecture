package nested.local;

/*
    변수의 생명 주기 정리
    1. 클래스 변수 : 프로그램 종료까지, 가장 길다 (메서드 영역)
     - 클래스 변수(static 변수)는 메서드 영역에 존재하고, 자바가 클래스 정보를 읽어 들이는 순간부터 프로그램 종료까지 존재한다.
    2. 인스턴스 변수 : 인스턴스의 생존 기간 (힙 영역)
     - 인스턴스 변수는 본인이 소속된 인스턴스가 GC되기 전까지 존재한다. 생존 주기가 긴 편이다.
    3. 지역 변수 : 메서드 호출이 끝나면 사라짐 (스택 영역)
     - 지역 변수는 스택 영역의 스택 프레임 안에 존재한다. 따라서 메서드가 호출되면 생성되고,
       메서드 호출이 종료되면 스택 프레임이 제거되면서 그 안에 있는 지역 변수도 모두 제거된다.
       생존 주기가 아주 짧다. 참고로 매개변수도 지역 변수의 한 종류이다.

    지역 클래스 인스턴스의 생존 범위
    - 지역 클래스로 만든 객체도 인스턴스이기 때문에 힙 영역에 존재한다. 따라서 GC 전까지 생존한다.
      => `LocalPrinter` 인스턴스는 `process()` 메서드 안에서 생성된다. 그리고 `process()`에서 `main()`으로 생성한
         `LocalPrinter` 인스턴스를 반환하고 `printer` 변수에 참조를 보관한다.
         따라서 `LocalPrinter` 인스턴스는 `main()`이 종료될 때까지 생존한다.
    - `paramVar`, `localVar`와 같은 지역 변수는 `process()` 메서드를 실행하는 동안에만 스택 영역에서 생존한다.
      `process()` 메서드가 종료되면 `process()` 스택 프레임이 스택 영역에서 제거 되면서 함께 제거된다.
 */

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;   // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print(); 를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();    // => `process()` 메서드가 이미 종료되었으므로 해당 지역 변수들도 이미 제거된 상태인데 지역 변수의 값들이 모두 정상적으로 출력

        /*
            변수 캡처 : 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사해서 생성한 인스턴스에 함께 넣어두는 것
            과정
             1. LocalPrinter 인스턴스 생성 시도 : 지역 클래스의 인스턴스를 생성할 때 지역 클래스가 접근하는 지역 변수를 확인
             2. 사용하는 지역 변수 복사 : 지역 클래스가 사용하는 지역 변수를 복사한다.
             3. 지역 변수 복사 완료 : 복사한 지역 변수를 인스턴스에 포함한다.
             4. 인스턴스 생성 완료 : 복사한 지역 변수를 포함해서 인스턴스 생성이 완료
             => `LocalPrinter` 인스턴스에서 `print()` 메서드를 통해 `paramVar`,`localVar`에 접근하면 스택 영역에 있는 지역 변수에 접근하는 것이 아니다.
                 대신에 인스턴스에 있는 캡처한 변수에 접근한다.
         */
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
