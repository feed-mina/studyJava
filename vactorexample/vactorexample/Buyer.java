package vactorexample;

// 독립클래스 : 구매자들을 인스턴스로 만들어서 고객관리 할때 인스턴스로 한다. 
// 독립클래스 와 제품군 클래스들 ..
public class Buyer {
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수
    
    // public void buy(TV tv){
    //     // 구매자가 가진 돈 보다 제품의 가격이 비싼 경우
    //     if(this.money < tv.price){
    //         System.out.println("잔액이 부족하여 물건 구입이 안됩니다 !");
    //         return;            
    //     }
    //     this.money -= tv.price;
    //     this.bonusPoint += tv.bonusPoint;
    //     System.out.println(tv+"를 구매하셨습니다.");
    // Computer, Audio 등등 일일히 매서드를 만들어줘야 한다. -> 그 대신 매개변수의 다형성을 사용해서 코드를 깔끔하게 만들 수 있다.
    // }
    
    // 여기서 매개변수 Product 타입이 왔다는 것은 무엇을 의미하는가?
    // product이거나 그의 자손들이 다 올 수 있다는 것을 의미한다. => 매개변수의 다형성
    public void buy(Product product){
        // 구매자가 가진 돈보다 비싼 경우
        if(this.money < product.price){
            System.out.println("잔액이 부족하여 물건 구입이 안됩니다.!");
            return;
        }
        
        this.money -= product.price;
        this.bonusPoint += product.bonusPoint;
        System.out.println(product + "를 구매하셨습니다.");
    }
    
}
