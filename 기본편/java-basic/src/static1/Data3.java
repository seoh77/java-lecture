package static1;

public class Data3 {
    public String name;

    // `static` 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있다.
    // `static` 이 붙은 멤버 변수는 인스턴스 영역에 생성되지 않고, 메서드 영역에서 관리한다.
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
