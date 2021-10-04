package inheritanceExample;

public class Car {
    /**
     * 동일한 타입의 값들은 배열로 관리하자
     */
//    Tire frontLeftTire = new Tire("앞왼쪽", 6);
//    Tire frontRightTire = new Tire("앞오른쪽", 2);
//    Tire backLeftTire = new Tire("뒤왼쪽", 3);
//    Tire backRightTire = new Tire("오른왼쪽", 4);

    Tire[] tires = {
            new Tire("앞왼쪽", 6),
            new Tire("앞오른쪽", 2),
            new Tire("뒤왼쪽", 3),
            new Tire("뒤오른쪽", 4)
    };



    // 펑크나는 타이어가 있을 경우 stop() 메소드를 호출하고 해당 타이어 번호를 리턴한다.
    // 상속 관계에 있는 객체들을 배열로 관리하면 제어문에서 가장 많은 혜택을 본다
    int run() {
//        if(!frontLeftTire.roll()) {
//            stop(); return 1;
//        }
//        if(!frontRightTire.roll()) {
//            stop(); return 2;
//        }
//        if(!backLeftTire.roll()) {
//            stop(); return 3;
//        }
//        if(!backRightTire.roll()) {
//            stop(); return 4;
//        }
//        return 0;
        for (int i = 0; i < tires.length; i++) {
            if(!tires[i].roll()) {
                stop(); return (i+1);
            }
        }
        return 0;
    }

    void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

}
