package interfaceExample03;
// 2023-04-14
public class A {
    // B 클래스가 만들어져야만 컴파일 예외가 사라진다. 
    // B클래스가 A클래스에게 직접적 영향을 끼친다.
    
    // public void method (B b){
    //  b.method();
    // }
    // 매개변수로 I를 받는다. 매개변수인 B만 들어간다. 
    // 간접적 관계 : 사용하는 측 
    public void method(I i){
        i.method();
    }
}
