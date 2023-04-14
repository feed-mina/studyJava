package interfaceExample;

public class Person implements A {

    // 인터페이스 A에 있는 다른 매서드도 같이 구현
    
	@Override
	public void method() {
		System.out.println("인터페이스 A를 구현한 Person클래스입니다.");		
	}
	
	public void method1() {
		System.out.println("Person클래스의 멤버메서드입니다.");
	}

}
