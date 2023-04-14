package interfaceExample;

//A인터페이스를 구현한 클래스 ,implements로 인터페이스를 받는다. 
public class Member implements A {

	@Override
	public void method() {
		System.out.println("인터페이스 A를 구현한 Member의 method()호출됨");		
	}
	
	public void method1() {
		System.out.println("Member클래스의 있는 method1()호출됨");
	}
}