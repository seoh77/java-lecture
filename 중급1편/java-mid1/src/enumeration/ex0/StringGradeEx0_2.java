package enumeration.ex0;

/*
    등급에 문자열을 사용하는 방식은 아래와 같은 문제가 있다.
    - 타입 안정성 부족 : 문자열은 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있다.
    - 데이터 일관성 : "GOLD", "gold", "Gold" 등 다양한 형식으로 문자열을 입력할 수 있어 일관성이 떨어진다.

    String 사용 시 타입 안정성 부족 문제
    - 값의 제한 부족 : `String`으로 상태나 카테고리를 표현하면, 잘못된 문자열을 실수로 입력할 가능성이 있다.
    - 컴파일 시 오류 감지 불가 : 이러한 잘못된 값은 컴파일 시에는 감지되지 않고, 런타입에서만 문제가 발견되기 떄문에 디버깅이 어려워질 수 있다.
 */

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamond = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamond);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}
