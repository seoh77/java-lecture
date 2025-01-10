package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // -> volumeUp() 메서드를 사용해서 음량이 100을 넘지 못하도록 기능을 개발했지만 volume 필드에 직접 접근해서 원하는 값을 설정할 수 있기 때문에 소용없다.
        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
