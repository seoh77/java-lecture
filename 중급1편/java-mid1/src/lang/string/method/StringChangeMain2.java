package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "    Java Programing  ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        /*
            - `trim()` : 문자열 양쪽 끝의 공백을 제거한다. 단순 Whitespace만 제거할 수 있다.
            - `strip()` : Whitespace와 유니코드 공백을 포함해서 제거한다. (자바 11부터 가능)
         */
        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'");
    }
}
