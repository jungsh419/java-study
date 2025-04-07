package javabasic.access;

public class Speaker {
    private int volume;

    Speaker(int vol)
    {
        this.volume = vol;

    }
    void volumeUp(){
        if(this.volume>=100)
        {
            System.out.println("더이상 볼륨을 높일 수 없습니다.");
        }
        else
        {
            this.volume+=10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown()
    {
        volume -= 10;
        System.out.println("volumeDown 호출");

    }

    void showVolume() {
        System.out.println("현재 음량:" + volume);
    }
}
