package lang.wraaper;

/*
    `int`, `double`은 객체가 아닌 기본형이다.
    - 기본형 데이터는 객체가 아니기 때문에, 객체 지향 프로그래밍의 장점을 살릴 수 없다.
      예를 들어 객체는 유용한 메서드를 제공할 수 있는데, 기본형은 객체가 아니므로 메서드를 제공할 수 없다.
    - 기본형 데이터 타입은 null 값을 가질 수 없다.
      때로는 '데이터가 없음'이라는 상태를 나타내야 할 필요가 있는데, 기본형은 항상 값을 가지기 때문에 이런 표현을 할 수 없다.
 */

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    /**
     * 두 값을 비교하는 메서드
     * @param value
     * @param target
     * @return
     */
    public static int compareTo(int value, int target) {
        if(value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
