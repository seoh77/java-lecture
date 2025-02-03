package static2;

public class DecoUtil2 {

    // `static`을 붙이면 정적 메서드를 만들 수 있다.
    // 그리고 이 정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스명을 통해서 바로 호출할 수 있다.
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
