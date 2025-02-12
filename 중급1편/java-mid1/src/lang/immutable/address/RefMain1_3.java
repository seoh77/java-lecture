package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b  = a;     // 객체를 공유한다고 바로 사이드 이펙트가 발생하지 않는다. 문제의 직접적인 원인은 공유된 객체의 값을 변경한 것에 있다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}