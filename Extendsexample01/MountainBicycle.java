package Extendsexample01;
// 2023-04-11 상속과 포함 예제
public class MountainBicycle extends Bicycle {
    //상속을 하는 이유
    // 1.공통된 코드는 조상에서 관리
    // 2. 개별적인 부분은 자손에서 따로 관리
    // 3. 코드의 재사용성
    
    //상속은 직접적 관계
    // 맴버 개수 : 5개
    String frame;
    int gear;
    int price;
    
    public void print(){
        
        System.out.println("id : " + this.id);
        System.out.println("brand : " + this.brand);
        System.out.println("frame : " + this.frame);
        
        System.out.println("gear : " + this.gear);
        System.out.println("price : " + this.price);
        System.out.println("owner : " + this.owner);
    }
    public static void main(String[] args){
        MountainBicycle moutainBicycle = new MountainBicycle();
        moutainBicycle.id = 11111;
        moutainBicycle.brand = "LESPO";
        moutainBicycle.frame = "알루미늄";
        moutainBicycle.gear = 33;
        moutainBicycle.price = 1000;
        moutainBicycle.owner = "민예린";
    	moutainBicycle.print();
    }
}
