package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string);     // java.lang.Object@6acbcfc0

        // Object 직접 출력
        System.out.println(object);     // java.lang.Object@6acbcfc0
    }
}
