package exceptionexample;
// 2023-04-24
public class ThrowsEx {
//JVM에게 예외를 던진다.
	public static void main(String[] args) {
		//main()에서 method1()호출하고 있으니 여기서 예외처리를
		//해야한다.
	// method1(); // Unhandled type exceptionexample
        try {
			method1();
        }
        catch (Exception e) {
            System.out.println("예외발생");
            System.out.println(e);
        }
    }
    
    // Throws는 매서드 선언부 끝에 작성을 하며 호출한 곳에서 예외를 되던지며
    // 호출한 곳에서 예외를 반드시 처리해야 한다.
    public static void method1() throws Exception {
	method2();
    }

    public static void method2() throws Exception{
        // method2의 exception이 method1의 exception으로 던지고 method1의 exception을 main에서 surrounded with try-cath로 받는다.
        System.out.println(10/0); // 산술예외(실행예외)
    }


}
