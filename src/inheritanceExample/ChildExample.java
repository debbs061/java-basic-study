package inheritanceExample;

public class ChildExample {
    public static void main(String[] args) {

        Parent parent = new Child(); // promotion(자동타입변환)
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3();

        Child child = (Child) parent; // 강제 타입 변환 (부모->자식으로)
        child.field2 = "hi";
        child.method3();

    }
}
