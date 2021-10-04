package inheritanceExample;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();

            /**
             * Tire 필드에 HankookTire, KumhoTire 객체를 대입하고 있다. -> 즉, "자동 타입 변환" 이 일어나고 있다.
             * 교체된 이후부터는 Car 객체의 run() 메소드가 호출될 때 오버라이딩된 roll() 메소드가 실행된다.
             */
            if (problemLocation != 0) {
                System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
                car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15);
            }
//            switch (problemLocation) {
//                case 1:
//                    System.out.println("앞왼쪽 HankookTire 로 교체");
//                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
//                    break;
//                case 2:
//                    System.out.println("앞오른쪽 KumhoTire 로 교체");
//                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
//                    break;
//                case 3:
//                    System.out.println("뒤왼쪽 HankookTire 로 교체");
//                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
//                    break;
//                case 4:
//                    System.out.println("뒤오른쪽 KumhoTire로 교체");
//                    car.backRightTire = new KumhoTire("뒤오른쪽", 17);
//                    break;
//            }
            System.out.println("-----------------"); // 1회전 시 출력되는 내용을 구분
        }
    }
}
