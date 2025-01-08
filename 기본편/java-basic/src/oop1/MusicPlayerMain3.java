package oop1;

/*
    각각의 기능을 메서드로 만들어 모듈화 시키기

    장점
    - 중복 제거 : 로직 중복이 제거되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
    - 변경 영향 범위 : 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
    - 메서드 이름 추가 : 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.

    모듈화
    : 쉽게 이야기해서 레고 블럭을 생각하면 된다. 필요한 블럭을 가져다 꼽아서 사용할 수 있다.
      여기서는 음악 플레이어의 기능이 필요하면 해당 기능을 메서드 호출 만으로 손쉽게 사용할 수 있다.
      이제 음악 플레이어와 관련된 메서드를 조립해서 프로그램을 작성할 수 있다.
      
    절차 지향 프로그래밍의 한계
    : 데이터와 기능이 분리되어 있다.
      음악 플레이어의 데이터는 MusicPlayerData에 있는데, 그 데이터를 사용하는 기능은 MusicPlayerMain3에 있는 각각의 메서드에 분리되어 있다.
      데이터와 그 데이터를 사용하는 기능은 매우 밀접하게 연관되어 있다. 각각의 메서드를 보면 대부분 MusicPlayerData의 데이터를 사용한다.
      따라서 이후에 관련 데이터가 변경되면 MusicPlayerMain3 부분의 메서드들도 함께 변경해야 한다.
      이렇게 데이터와 기능이 분리되어 있으면 유지보수 관점에서도 관리 포인트가 2곳으로 늘어난다.

      객체 지향 프로그래밍이 나오기 전까지는 이렇게 데이터와 기능이 분리되어 있었다.
      하지만 객체 지향 프로그래밍이 나오면서 데이터와 기능을 온전히 하나로 묶어서 사용할 수 있게 되었다.
 */
public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDowm(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    /**
     * 음악 플레이어 켜기
     */
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    /**
     * 음악 플레이어 끄기
     */
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    /**
     * 음악 플레이어 볼륨 올리기
     */
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    /**
     * 음악 플레이어 볼륨 내리기
     */
    static void volumeDowm(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    /**
     * 음악 플레이어 상태 확인
     */
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
