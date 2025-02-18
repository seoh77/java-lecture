package enumeration.ref3;

public class DiscountService {

    // 객체지향 관점에서 자신의 데이터를 외부에 노출하는 것보다는 Grade 클래스가 자신의 할인율을 어떻게 계산하는지 스스로 관리하는 것이 캡슐화 원칙에 더 맞다.
    //  => Grade 클래스 안으로 `discount()` 메서드를 이동
    //  => Grade가 스스로 할인율을 계산하면서 DiscountService 클래스는 더 이상 필요하지 않다.
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
