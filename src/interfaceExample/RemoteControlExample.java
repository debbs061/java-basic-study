package interfaceExample;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스의 정적메소드는 인터페이스로 바로 호출 가능
        RemoteControl.changeBattery();

        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true); // 오버라이딩된 디폴트 메소드가 호출됨

//        RemoteControl rc = new RemoteControl() {
//            @Override
//            public void turnOn() {
//
//            }
//
//            @Override
//            public void turnOff() {
//
//            }
//
//            @Override
//            public void setVolume(int volume) {
//
//            }
//        };
    }
}
