package lang.wraaper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));  // -1
        System.out.println(findValue(intArr, 0));   // 0
        System.out.println(findValue(intArr, 1));   // 1
        System.out.println(findValue(intArr, 100)); // null
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for(MyInteger myInteger : intArr) {
            if(myInteger.getValue() == target) {
                return myInteger;
            }
        }

        // 객체에는 데이터가 없다는 `null`이라는 명확한 값이 존재한다.
        // -> `null` 값을 반환하는 경우 잘못하면 `NullPointerException`이 발생할 수 있으므로 주의!
        return null;
    }
}
