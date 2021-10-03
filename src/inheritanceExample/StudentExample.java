package inheritanceExample;

public class StudentExample {
    public static void main(String[] args) {
         Student student = new Student("홍길동", "12321434134", 1);
        System.out.println("student.name = " + student.name);
        System.out.println("student.ssn = " + student.ssn);
        System.out.println("student.studentNo = " + student.studentNo);
    }
}
