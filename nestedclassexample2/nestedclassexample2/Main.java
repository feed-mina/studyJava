package nestedclassexample2;
// 2023-04-17
public class Main {
    
    public static void main(String[] args){
        A a = new A();
        A.B b = a.new B(); // 인스턴스 멤버 클래스 B생성자
        a.method1();
    }
}
