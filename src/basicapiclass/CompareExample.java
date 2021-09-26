package basicapiclass;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);
        Student s3 = new Student(2);

        // Objects.compare 는 두 객체를 비교자로 비교해서 int 값을 리턴한다.
        int result = Objects.compare(s1, s2, new StudentComparator());
        System.out.println(result);
        result = Objects.compare(s1, s3, new StudentComparator());
        System.out.println(result);
    }

    static class Student {
        int id;
        public Student(int id) {
            this.id = id;
        }
    }

    // 비교자 Comparator 를 구현
    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.id, o2.id);
        }
    }

}
