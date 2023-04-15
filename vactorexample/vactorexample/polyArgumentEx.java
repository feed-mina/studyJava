package vactorexample;

public class polyArgumentEx {
    public static void main(String[] args){
        
        // 필드(매개변수)의 다형성
        Product p1 = new TV();
        Product p2 = new Computer(); 
        Product p3 = new TV();
        
        Product[] pArray = new Product[10];
        
        Buyer buyer = new Buyer();
        
        buyer.buy(new TV());
        buyer.buy(new Computer());
        // buyer.buy(new Apple()); // 독립클래스이기 때문 (extends Product)가 아니기 때문
        System.out.println("현재 남은 돈 : "+buyer.money +"만원입니다.");
        System.out.println("현재 남은 보너스 : "+buyer.bonusPoint +"점 입니다.");
    }
}
