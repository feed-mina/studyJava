package nestedclassexample;
// 2023-04-16
public class A {
    
    // 같은 클래스에 멤버 클래스들이 존재한다면, 외부 클래스에서는 얼마든지 사용이 가능하다. 
    // B b = new B();
    // A.C c = new A.C();
    
    // C c = new C();
    // 외부 클래스 A안에 중첩클래스 B가 있다. 밀접한관계가 있어 중첩클래스이자 멤버 클래스인 B를 사용 할 수 있다.
  	
   
  
    public A(){
   System.out.println("--------------------------------------------");
    System.out.println("외부 클래스 A의 생성자호출");
    
     System.out.println("--------------------------------------------");    
	B b = new B(); // 이게 왜 가능 할까요? 인스턴스 멤버클라스는 외부클래스 A의 멤버이다.
    System.out.println(b.a);
    b.method1();
    
    System.out.println("--------------------------------------------");    
    C c = new C(); // 밑에 멤버로써 C의 생성자가 있기 때문에 new C();를 만드는데 문제가 없다.
    System.out.println(c.a); // 인스턴스 메서드
    System.out.println(C.c); // 정적메서드
        
    System.out.println("--------------------------------------------");    
    c.method1(); 
    C.method2(); // C클래스 명으로 접근
    
    this.method(); // D클래스의 method를 의미한다.
    // D d = new D(); // 에러가 난다. 메서드 안에 로컬메서드가 있기 때문에. 매서드 내부에 선언 되어 있기 때문에 클래스 A에서는 보이지 않는다.
    System.out.println("--------------------------------------------");    
    }
    // 인스턴스 맴버 클래스 B
    class B{
        int a = 10;
        // static int cv= 20; 인스턴스를 생성해야 static 을 만들 수 있기 때문에 오류가 난다.
        public B(){
            System.out.println("중첩클래스 B의 생성자 호출");
        }
        public void method1(){
            System.out.println("B클래스의 멤버매서드 호출");
        }
        //static void method2(){}  static 매서드는 또한오류가 난다.
    }
    // 정적 멤버 클래스 C
    static class C {
        int a = 10;
        static int c = 20; // static 클래스라서 정적멤버 올 수 있다
        public C(){
            System.out.println("정적멤버 클래스 C의 생성자 호출");
        }
        public void method1(){
        System.out.println("정적멤버 클래스 C의 method1 호출");
            
        }
        public static void method2(){
        System.out.println("정적멤버 클래스 C의 method2 정적매서드 호출");
            
        }
    }
    public void method(){
        // 로컬 클래스 안에는 절대로 static멤버가 못온다. 메서드 호출할때면 인스턴스가 만들어져야 만들어야 되는데 static은 바로 접근해야 하기 때문에 static 멤버가 못온다.
        class D{
            int a = 1000;
            public D(){
                System.out.println("로컬 클래스 D의 생성자 호출");
            }
            public void lmethod(){
                System.out.println(this.a); // 여기서 this는 로컬클래스 D를 의미한다.
                System.out.println("로컬 클래스 D의 멤버 메서드 호출");
            }
        }
        // 로컬클래스는 메서드 내부에서만 생성 및 사용이 가능하다.
        D d = new D();
        d.lmethod();
    }
}
