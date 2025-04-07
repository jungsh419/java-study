package javabasic.access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speak = new Speaker(30);
        speak.showVolume();

        speak.volumeUp();
        speak.volumeUp();
        speak.volumeUp();
        speak.volumeUp();
        speak.volumeUp();
        speak.volumeUp();
        speak.volumeUp();
        speak.showVolume();
        speak.volumeUp();
        // speak.volume = 110; Speaker클래스의 volume을 private으로 변경
        speak.showVolume();

    }
}
