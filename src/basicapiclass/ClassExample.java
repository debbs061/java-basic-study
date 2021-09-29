package basicapiclass;

public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car();
        Class clazz = car.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());

    }
}
