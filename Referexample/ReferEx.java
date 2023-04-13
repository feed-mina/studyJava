package Referexample;
//2023-04-12

public class ReferEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		Child child = new Child();
		
		//멤버변수는 근본(자기의 클래스 타입)을 벗어나지 못함
		System.out.println(parent.x);
		System.out.println(child.x);
		
		//멤버메서드는 현재 참조하고 있는 인스턴에 영향을 받음
		parent.method();
		child.method();
		
		parent.type(new Car()); // parent타입에 object타입이 왔다는 것은 어떤 클래스이든지 전부 받을 수 있다.
	}
}
