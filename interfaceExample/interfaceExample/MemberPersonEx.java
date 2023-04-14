package interfaceExample;

public class MemberPersonEx {
    
    public static void main(String[] args){
        
        Member member = new Member();
        member.method();
        member.method1();
        
        // 추상클래스는 인터페이스의 본질이 된다. 
        // 인터페이스도 일종의 조상이다. 그래서 다형성 개념이 적용된다.
        A a = new Member(); // 인터페이스 필드의 다형성이 적용된다.
        a.method(); 
      //  a.method1(); //  근본을 벗어나지 못하므로 Member클래스의 맴버매서드는 호출 불가, 근본이 a라서 method1 은 호출을 할 수 없다. 
        
        Person person = new Person();
        person.method();
        person.method1();
        
        a = new Person();
        a.method();
        
    }
}
