package interfaceExample;

public class Car {
    // 인터페이스 타입 필드 선언 후, 초기 구현 객체 대입한 상태
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    // 인터페이스에 설명된 roll() 메소드를 호출함
    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
