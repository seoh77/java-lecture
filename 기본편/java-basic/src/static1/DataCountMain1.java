package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");   // -> 새로운 인스턴스 생성
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");   // -> 새로운 인스턴스 생성
        System.out.println("C count = " + data3.count); // -> 인스턴스에 사용되는 멤버 변수 count 값은 인스턴스끼리 서로 공유되지 않는다.
    }
}
