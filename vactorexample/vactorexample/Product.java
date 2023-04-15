package vactorexample;

public class Product {
    
    int price;
    int bonusPoint;
    
    public Product(int price){
        this.price = price;
        // 보너스 점수는 제품가격의 10%를 적립
        this.bonusPoint = (int)(price/10.0); // ()괄호 두개를 같이 묶어야 한다.
    }
}
