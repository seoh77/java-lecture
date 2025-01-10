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
        // -> volume 필드는 private 으로 설정되어 있기 때문에 외부에서 접근할 수 없다는 오류가 뜬다.
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;
        speaker.showVolume();
    }
}
