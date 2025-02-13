package lang.string;

/*
    기본형인 char은 문자 하나를 다룰 때 사용한다. char을 사용해서 여러 문자를 나열하려면 char[]를 사용해야 한다.
    => 하지만 char[]를 직접 다루는 방법은 매우 불편하기 때문에 자바는 문자열을 편리하게 다룰 수 있는 String 클래스를 제공한다.
 */

public class CharArrayMain {

    public static void main(String[] args) {
        char[] charArr = new char[]{'h','e','l','l','o'};
        System.out.println(charArr);

        String str = "hello";
        System.out.println("str = " + str);
    }
}
