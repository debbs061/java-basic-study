package basicapiclass;

import java.util.Arrays;

/**
 * equals() 메소드 재정의한다.
 * Member 타입이면서 id 필드값이 같을 경우는 true 를 리턴하고, 그 외의 경우는 false 를 리턴한다.
 */
public class Member implements Cloneable {
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 먼저 얕은 복사를 해서 name, age 를 복제한다.
        Member cloned = (Member) super.clone();
        // scores를 깊은 복제한다.
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        // car를 깊은 복제한다.
        cloned.car = new Car(this.car.model);
        return super.clone();
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
        }
        return cloned;
    }

}
