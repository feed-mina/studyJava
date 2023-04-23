package nestedclassexample2;

public class Outside {
    // 필드 선언
    String str = "Outside-field";
    
    // 멤버메서드
    public void method(){
        System.out.println("Outside-method() 호출");
        
    }
    
    class Inner {
        // Inner필드 선언
        String str = "Inner-field";
        //Inner 멤버 메서드
        public void method(){
            System.out.println("Inner-method() 호출");
        }
        
        // Inner 멤버 메서드
        public void showInfo(){
            System.out.println(this.str); // 여기의 this는 어떤걸까? 여기에서의 this는 Inner의 this를 의미
            this.method();
            // 외부 클래스의 접근하는 방법
            // 외부클래스명.this.외부클래스멤버이름 
            // System.out.println(Outside.str); // 정적 필드 접근 이라서 접근이 불가능
            System.out.println(Outside.this.str);
            Outside.this.method();
        }
    }
    
    public void show(){
         System.out.println("--------------------");
             // 외부 클래스 영역에서의 this는 당연히 Outside 클래스를 말한다.
        System.out.println(this.str); // 아우터 클래스의 this이다.
        this.method();
        
        // System.out.println(Inner.this.str);
    	// 외부클래스에서 내부클래스로 접근을 하려면 보이지가 않는다. 
    	// 아래와 같이 인스턴스를 하나 생성해서 중첩클래스의 멤버들에게 접근을 
        // 하면 된다.
        Inner in = new Inner(); // 외부클래스에서 내부 클래스를 접근하려면 인스턴스를 하나 생성해야만 접근이 가능하다.
      //  System.out.println(in.str);
        in.showInfo();
       }
}
