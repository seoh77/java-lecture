package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();   // 참조형
//        data = new Data();    // 컴파일 오류 -> 변수 선언 시점에 참조값을 할당했으므로 더는 참조값을 변경할 수 없다.

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
