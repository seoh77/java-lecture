package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIdx = str.indexOf(ext);
        String filename = str.substring(0, extIdx);
        String extName = str.substring(extIdx);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
