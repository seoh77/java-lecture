package lang.string;

/*
    String 클래스는 개발자가 직접 다루기 불편한 `char[]`를 내부에 감추고,
    String 클래스를 사용하는 개발자가 편리하게 문자열을 다룰 수 있도록 다양한 기능을 제공한다.

    기능(메서드)
    - `length()` : 문자열의 길이를 반환
    - `charAt(int index)` : 특정 인덱스의 문자를 반환
    - `substring(int beginIndex, int endIndex)` : 문자열의 부분 문자열을 반환
    - `indexOf(String str)` : 특정 문자열이 시작되는 인덱스를 반환
    - `toLowerCase()`, `toUpperCase()` : 문자열을 소문자 또는 대문자로 변환
    - `trim()` : 문자열 양 끝의 공백을 제거
    - `concat(String str)` : 문자열을 더한다
 */

public class StringBasicMain {

    public static void main(String[] args) {
        // 문자열은 매우 자주 사용되기 때문에 편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 `new String("hello")`와 같이 변경해준다.
        String str1 = "hello";
        String str2 = new String("hello");      // String은 클래스

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
