package lang.string.builder;

public class StringBuilderMAin1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // StringBuilder 메서드 체이닝 기법을 제공한다.
        // StringBuilder에서 문자열을 변경하는 대부분의 메서드도 메서드 체이닝 기법을 제공하기 위해 자기 자신을 반환한다.
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("string = " + string);
    }
}
