package exceptionexample;

//2023-04-24
public class BalanceException extends Exception{
    
    public BalanceException(){
	
    }
    
    public BalanceException(String message){
        super(message); // 조상클래스의 생성자호출
    }
}
