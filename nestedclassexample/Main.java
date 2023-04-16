package nestedclassexample;
// 2023-04-16
public class Main {
    public static void main(String[] args){
        System.out.println("-------");   
    	System.out.println("생성자 호출 : A의 생성자 호출");
        A a = new A();
        // 인스턴스 멤버클래스인 B는 반드시 외부 클래스 A의 인스턴스가 있어야 생성 가능하다.
        
        System.out.println("주소가 다 다른 독립된 객체이다.");
        System.out.println("-------");   
    	
        System.out.println("인스턴스 호출");
        A.B b = a.new B(); // 주소가 다 다른 독립된 객체이다.
        b.method1();
 		System.out.println("-------");   
    	System.out.println("정적 호출");
        System.out.println(A.C.c); // static 멤버
        A.C.method2(); // 정적메서드 호출
        // 정적 멤버 클래스인 C는 외부 클래스 A의 인스턴스가 있던 없던 상관 없이 접근 가능하다.
        System.out.println("-------");
        System.out.println("인스턴스 맴버가 있기 때문에 생성할 수 있다. 인스턴스 멤버 클래서 호출");
        A.C c = new A.C();
        System.out.println(c.a);
        c.method1();
    	
        // 외부 클래스의 인스턴스를 생성하면 얼마든지 매서드를 호출하여 로컬클래스를 생성하여 사용 할 수 있다.
        System.out.println("-------");
        System.out.println("로컬 클래스 호출");
        a.method();
        System.out.println("-------");
        
    }
}
