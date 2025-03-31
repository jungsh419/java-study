package javabasic.Class3;

public class MusicPlayerUser {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.on();// -> 켜짐
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeUp();// -> 볼륨 5
        mp.showStatus();
        mp.volumedown();
        mp.volumedown();
        mp.volumedown(); // -> 볼륨 2
        mp.off(); // -> 꺼짐
        mp.showStatus();
    }
}
