package lang.string.builder;

/*
    불변인 String 클래스의 단점은 문자를 더하거나 변경할 때마다 계속해서 새로운 객체를 생성해야 한다는 점이다.
    문자를 자주 더하거나 변경해야 하는 상황이라면 더 많은 String 객체를 만들고, GC해야 한다.
    결과적으로 컴퓨터의 CPU, 메모리 자원을 더 많이 사용하게 된다.
    그리고 문자열의 크기가 클수록, 문자열을 더 자주 변경할수록 시스템의 자원을 더 많이 소모한다.

    => 이 문제를 해결하기 위해서는 불변이 아닌 가변 String이 존재하면 된다.
       가변은 내부의 값을 바로 변경하면 되기 때문에 새로운 객체를 생성할 필요가 없다.
       따라서 성능과 메모리 사용면에서 불변보다 더 효율적이다.
       단, 사이드 이펙트를 주의해야 한다.
 */

public class StringBuilderMAin1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 문자열 추가
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        // 특정 위치에 문자열 삽입
        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        // 특정 범위의 문자열 삭제
        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        // 문자열 뒤집기
        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
