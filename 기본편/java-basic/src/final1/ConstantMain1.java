package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    public static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);

        // 유지 보수 관점에서 1000이 무엇을 의미하는지 모를 수 있음 -> 매직 넘버 문제
        if(currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
