package construct;

public class MemberThis {
    String nameField;

    /*
        멤버 변수와 매개변수의 이름이 다른 경우에는 this를 생략해도 된다.
        하지만 쉬운 파악을 위해서 `this`를 무조건 붙이는 코딩 스타일도 있다.
        -> 요즘은 IDE가 알아서 색깔로 구분해주기 때문에 굳이 붙일 필요는 없다.
     */
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
