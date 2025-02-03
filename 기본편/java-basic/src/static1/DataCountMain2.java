package static1;

public class DataCountMain2 {

    /*
        아래 코드는 counter 인스턴스를 공용으로 사용한 덕분에 객체를 생성할 때마다 값을 정확하게 증가시킬 수 있다.
        하지만 불편한 점
            - `Data2` 클래스와 관련된 일인데 `Counter` 라는 별도의 클래스를 추가로 사용해야 한다.
            - 생성자의 매개변수도 추가되고, 생성자가 복잡해진다. 생성자를 호출하는 부분도 복잡해진다.
     */

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
