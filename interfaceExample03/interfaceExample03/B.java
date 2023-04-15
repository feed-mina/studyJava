package interfaceExample03;
// 2023-04-14
// public class B {
//     public void method(){
//             System.out.println("B 클래스 매서드 호출");
//     }
//}

public class B implements I{
    // B클래스는 B클래스 대로 구현
    // I인터페이스를 구현함으로써 B클래스와 A클래스는 간접적 관계가 된다.
    //  indirect 관계 : 제공하는 측 (구현하는 측)
    @Override
    public void method(){
            System.out.println("인터페이스 I를 구현한 B클래스의 매서드");
    }
}
