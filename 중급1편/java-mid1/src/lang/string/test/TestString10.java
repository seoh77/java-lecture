package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitsArr = fruits.split(",");

        for(String fruit : fruitsArr) {
            System.out.println(fruit);
        }

        String joinedString = String.join("->", fruitsArr);
        System.out.println("joinedString = " + joinedString);
    }
}
