package basicapiclass;

/**
 * equals() 메소드 재정의한다.
 * Member 타입이면서 id 필드값이 같을 경우는 true 를 리턴하고, 그 외의 경우는 false 를 리턴한다.
 */
public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // Object 타입의 매개변수는 모든 객체가 매개값으로 제공될 수 있기 때문에
        // instanceof 연산자로 기준 객체와 동일한 타입인지 제일 먼저 확인해야 한다.
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }
}
