package interfaceExample;

public interface ChildInterface3 extends ParentInterface{
    @Override
    public void method2(); // 부모의 디폴트 메소드를 추상 메소드로 재선언
    public void method3();
}
