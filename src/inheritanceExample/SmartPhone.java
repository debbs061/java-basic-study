package inheritanceExample;

public class SmartPhone extends Phone{
    public SmartPhone(String owner) {
        // 자식 객체가 생성될 때 super 를 호출해서 추상 클래스 객체를 생성하므로 추상 클래스도 생성자가 반드시 있어야 한다.
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
