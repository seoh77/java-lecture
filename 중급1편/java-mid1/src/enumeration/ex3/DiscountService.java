package enumeration.ex3;

import static enumeration.ex3.Grade.BASIC;

public class DiscountService {

    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        // static import 단축키: opt + enter
        // -> 열거형을 사용하는 경우 `static import`를 적절하게 사용하면 더 읽기 좋은 코드를 만들 수 있다.
        if(classGrade == BASIC) {
            discountPercent = 10;
        } else if (classGrade == Grade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
