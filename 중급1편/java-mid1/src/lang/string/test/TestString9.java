package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] emailSplit = email.split("@");

        System.out.println("ID = " + emailSplit[0]);
        System.out.println("Domain = " + emailSplit[1]);
    }
}
