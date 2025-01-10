package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        // -> public은 모든 접근을 허용하기 때문에 필드, 메서드 모두 접근 가능하다.
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        // -> AccessInnerMain은 AccessData와 같은 패키지이다. 따라서 default 접근 제어자에 접근할 수 있다.
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가
        // -> AccessData 내부에서만 접근할 수 있으므로 호출 불가하다.
//        data.privateField = 3;
//        data.privateMethod();

        // innerAccess() 메서드는 외부에서 호출되었지만 innerAccess() 메서드는 AccessData에 포함되어 있다.
        // 따라서 이 메서드는 자신의 private 필드와 메서드에 모두 접근할 수 있다.
        data.innerAccess();
    }
}
