package construct;

public class ConstructMain1 {

    /*
        생성자 장점
         - 중복 호출 제거 : 생성자가 없이 메서드를 사용하는 경우 어떤 작업을 수행하기 위해 메서드를 직접 한 번 더 호출해야 했다.
                        하지만 생성자를 사용하면 객체 생성과 동시에 생성 직후에 필요한 작업을 한 번에 처리할 수 있게 되었다.
         - 제약 (생성자 호출 필수) : 메서드는 깜빡하고 호출하지 않아도 프로그램이 동작하기 때문에 값이 없는 데이터가 생길 수도 있다.
                                생성자는 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다.
                                => 즉, 생성자를 사용하면 필수값 입력을 보장할 수 있다.
     */

    public static void main(String[] args) {
        // 인스턴스를 생성하는 동시에 값을 설정해야 한다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
