package javabasic.Class3;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){this.isOn = true;}
    void off(){this.isOn = false;}
    void volumeUp(){this.volume++;}
    void volumedown(){this.volume--;}
    void showStatus(){
        String status = (this.isOn)?"켜짐":"꺼짐";
        System.out.println("현재 상태 : "+ status + " 볼륨 : " + this.volume );
    }


}
