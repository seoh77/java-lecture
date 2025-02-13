package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));    // false

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));    // true
    }

    // isSame()의 경우 매개변수로 넘어오는 String 인스턴스가 `new String()`으로 만들어진 것인지, 문자열 리터럴로 만들어진 것인지 확인할 수 있는 방법이 없다.
    // => 따라서 문자열 비교는 항상 `equals()`를 사용해서 동등성 비교를 해야 한다.
    private static boolean isSame(String x, String y) {
        // return x == y;
        return x.equals(y);
    }
}
