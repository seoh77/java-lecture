package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final을 지역 변수에 설정할 경우 최초 한 번만 할당할 수 있다. 이후에 변수의 값을 변경하려면 컴파일 오류가 발생한다.
        final int data1;
        data1 = 10;     // 최초 한 번만 할당 가능
//        data1 = 20;     // 컴파일 오류

        // final을 지역 변수 선언시 바로 초기화 한 경우 이미 값이 할당되었기 때문에 값을 할당할 수 없다.
        final int data2 = 10;
//        data2 = 20;     // 컴파일 오류

        method(10);
    }

    static void method(final int parameter) {
        // 매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다. 따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다.
//        parameter = 20;     // 컴파일 오류
    }
}
