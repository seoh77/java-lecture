package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
//        DecoData.staticCall();
        staticCall();   // -> import 한 후 앞에 클래스명을 생략할 수 있다.

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가 : 인스턴스를 통한 접근
        //  -> 권장X : 인스턴스 메서드라고 착각할 수도 있다.
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
