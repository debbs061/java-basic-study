package interfaceExample;

public interface ChildInterface2 extends ParentInterface{
    @Override
    public default void method2() {} // 부모 인터페이스의 디폴트 메소드를 재정의

    public void method3();
}
