package protetedexample;
// 2023-04-13
public class Phone {
    // 필드 (멤버변수), 외부로부터 접근 못하게 막는다.
    
    // private String model;
    // protected접근 제어자 : 같은 패키지에서 다 접근이 가능하다. 다른 패키지에서는 접근이 불가능하다. 다른 패키지에서 상속받은 클래스에서도 접근 불가하다.
    protected String model;
    private String color;
    private String company;
    
     // 위 변수로 protected, private로 캡슐화 하고 밑에 get매서드로 사용할 수 있게 한다.
public Phone(String model, String color, String company){
    super();
    this.model = model;
    this.color = color;
    this.company = company;
}
    
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public String getCompany(){
        return company;
    }
    @Override
    public String toString(){
        String str = "모델: " + this.getModel() + ", 색상:" +this.getColor()+", 제조회사"+this.getCompany();
    	return str;
    }
}
