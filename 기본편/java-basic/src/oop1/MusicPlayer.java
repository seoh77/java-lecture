package oop1;

/*
    MusicPlayer 클래스에 음악 플레이어에 필요한 속성과 기능을 모두 정의
    -> 코드가 더 읽기 쉬운 것은 물론이고, 속성과 기능이 한 곳에 있기 때문에 변경도 더 쉬워진다.

    캡슐화
    - 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다.
 */

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    /**
     * 음악 플레이어 켜기
     */
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    /**
     * 음악 플레이어 끄기
     */
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    /**
     * 음악 플레이어 볼륨 올리기
     */
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    /**
     * 음악 플레이어 볼륨 내리기
     */
    void volumeDowm() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    /**
     * 음악 플레이어 상태 확인
     */
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if(isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
