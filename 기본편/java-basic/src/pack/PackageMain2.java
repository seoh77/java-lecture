package pack;

// import를 사용하면 다른 패키지에 있는 클래스를 가져와서 사용할 수 있다.
import pack.a.User;

// 만약 pack.a에 있는 모든 클래스를 import 해야 한다면 아래와 같이 사용할 수도 있다.
// import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();

        // import를 사용했기 때문에 패키지 명을 생략하고 클래스 이름만 적어도 된다.
        User user = new User();
    }
}
