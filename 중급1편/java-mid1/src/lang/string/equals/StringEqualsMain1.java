package lang.string.equals;

/*
    String 클래스를 비교할 때는 `==` 비교가 아니라 항상 `equals()` 비교를 해야한다.
    - 동일성(Identity) : `==` 연산자를 사용해서  두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    - 동등성(Equality) : `equals()` 메서드를 사용하여 두 객체가 논리적으로 같은지 확인
 */

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));    // false
        System.out.println("new String() equals 비교: "  + (str1.equals(str2)));  // true

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));     // true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));    // true

        /* 문자열 리터럴, 문자열 풀
            1) `String str3 = "hello"`와 같이 문자열 리터럴을 사용하는 겨우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
            2) 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 `String` 인스턴스를 미리 만들어둔다.
               이때 같은 문자열이 있으면 만들지 않는다.
            3) `String str3 = "hello"`와 같이 문자열 리터럴을 사용하면 문자열 풀에서 "hello"라는 문자를 가진 String 인스턴스를 찾는다.
               그리고 찾은 인스턴스의 참조를 반환한다.
            4) `String str4 = "hello"`의 경우 "hello" 문자열 리터럴을 사용하므로 문자열 풀에서 str3과 같은 참조를 사용한다.
            5) 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.

            => 따라서 문자열 리터럴을 사용하는 경우 같은 참조값을 가지므로 `==` 비교에 성공한다.
         */
    }
}
