package inheritanceExample;

public class Student extends People{

    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); // 부모의 기본 생성자가 존재하지 않는다면, 매개변수가 있는 부모 생성자를 명시적으로 호출해줘야 한다.
        this.studentNo = studentNo;
    }
}
