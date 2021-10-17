package interfaceExample;

// 구현 클래스
public class Television implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스 상수를 이용해서 volume 필드의 값을 제한하고 있다.
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}
