package exceptionexample;
// 2023-04-24
public class TryCatchEx {
    public static void main(String[] args){
        
        System.out.println(1);
        System.out.println(2);
    try {
		System.out.println(3);
        System.out.println(2/0); // Arithmetic error  
        	
		System.out.println(5); // 출력이 안됨
		}
	catch (ArithmeticException e) {
		System.out.println(6); // 출력이 안됨
    
		}
	System.out.println(7); 

    	}
}
