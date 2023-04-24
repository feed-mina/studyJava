package exceptionexample;
//2023-04-24
public class AccountEx {
    
    public static void main(String[] args){
        
        Account account = new Account();
        account.deposit(50000);
        System.out.println("현재 잔액 : " + account.getBalance());
        
        try {
//예외처리코드가 반드시 들어가야함, withdraw()예외를 던지고 있으니....
        account.withdraw(10000);
        account.withdraw(50000);
        System.out.println("현재 잔액 : " + account.getBalance());
            
        }
        catch (Exception e) {
            System.out.println("예외 원인 :"+ e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("정상종료");
        }
    }
}
