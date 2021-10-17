package interfaceExample;

/**
 * 필드 다형성 테스트
 */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();
        myCar.run();
    }
}
