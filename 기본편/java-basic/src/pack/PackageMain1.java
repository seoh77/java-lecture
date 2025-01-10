package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        // 사용자와 같은 위치일 경우 패키지 경로를 생략해도 된다.
        Data data = new Data();

        // 패키지의 위치가 다르면 `pack.a.User` 와 같이 패키지 전체 경로를 포함해서 클래스를 적어주어야 한다.
        pack.a.User user = new pack.a.User();
    }
}
