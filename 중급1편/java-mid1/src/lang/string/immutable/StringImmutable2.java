package lang.string.immutable;

/*
    String이 불변으로 설계된 이유
    - String은 자바 내부에서 문자열 풀을 통해 최적화한다.
    - 만약 String 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되어 버리는 문제가 발생한다.
    - 따라서, String 클래스는 불변으로 설계되어 이런 사이드 이펙트 문제가 발생하지 않는다.
 */

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");   // String은 불변 객체이므로 변경이 필요한 경우 기존 값을 변경하지 않고, 대신 새로운 결과를 만들어서 반환한다.
        System.out.println("str1 = " + str1);     // str1 = hello
        System.out.println("str2 = " + str2);     // str2 = hello java
    }
}
