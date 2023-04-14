package abstractexample02;
// 2023-04-14
public abstract class Phone {
    private int serial_No;
    private String owner;
    private String company;
    
    public Phone(int serial_No, String owner, String company){
        super();
        this.serial_No = serial_No;
        this.owner = owner;
        this.company = company;
    }
    
    public int getSerial_No(){
        return serial_No;
    }
    
    public String getOwner(){
        return owner;
    }
    public String getCompany(){
        return company;
    }
    
    //추상 매서드 선언
    public abstract void turnOn();
    public abstract void turnOff();

    public void showInfo(){
        System.out.println("시리얼넘버"+this.getSerial_No());
        System.out.println("회사"+this.getCompany());
        System.out.println("사용자"+this.getOwner());
    }
}
