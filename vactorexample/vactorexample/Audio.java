package vactorexample;

public class Audio extends Product{
    
    // 조상클래스 (조상클래스에 매개변수가 있는 생성자 Product(int price){}가 있기때문에 super로 상속을 해야 한다.)
    public Audio(){
        super(200);
    }
    
    @Override
    public String toString(){
        return "Audio";
    }
}