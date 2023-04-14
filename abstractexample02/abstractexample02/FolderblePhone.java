package abstractexample02;

public class FolderblePhone  extends Phone {
    // 2023-04-14
    // 생성자
    public FolderblePhone(int serial_No, String owner, String company) {
        super(serial_No, owner, company);
    }
    
    
    //추상매서드 2개 재정의
    @Override
    public void turnOn(){
	System.out.println("폴더블폰이 커졌습니다.");
    }
    
    
    @Override
    public void turnOff(){
    	System.out.println("폴더블폰이 꺼졌습니다");
    
    }
    
    // 자체 매서드
    public void foldOn(){
        System.out.println("폴드 기능이 실행합니다.");
    }
    
    public void foldOff(){
        System.out.println("폴드 기능이 해제됩니다.");
    }
}
