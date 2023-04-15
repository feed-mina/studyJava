package interfaceExample03;
// 2023-04-14
public class IndirectEx {
   public static void main(String[] args){
       // B 클래스가 필요하다.
       I i = new B();
       i.method();
    //    A a = new A();
   	// a.method(b);
    //   a.method(new B());
       
       i = new C();
       i.method();
   }
}
