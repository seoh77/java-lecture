package enumeration.ref2;

public enum Grade {
    // 상수 마지막에 괄호를 열고 생성자에 맞는 인수를 전달하면 적절한 생성자가 호출
    BASIC(10), GOLD(20), DIAMOND(30);

    // discountPercent 필드를 추가하고, 생성자를 통해서 필드에 값을 저장
    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 열거형도 클래스이므로 메서드를 추가할 수 있다.
    public int getDiscountPercent() {
        return discountPercent;
    }
}
