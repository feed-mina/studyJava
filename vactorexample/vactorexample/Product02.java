package vactorexample;

//조상클래스 ---------- Book  --- ConversationBook
//         ---------- CompactDisc
public class Product02 {
    
    private int productID;
    private String description;
    private String maker;
    private int price;
    
// 생성자
    public Product02(int productID, String description, String maker, int price){
        super();
        this.productID = productID;
        this.description = description;
        this.maker = maker;
        this.price = price;
    }

// getter()
    public int getProductID(){
        return productID;
    }
    public String getDescription() {
        return description;
    }
    public String getMaker(){
        return maker;
    }
    public int getPrice() {
        return price;
    }
    public void showInfo(){
        System.out.println("상품ID" + (this.getProductID() + 1));
        System.out.println("상품설명" + this.getDescription());
        System.out.println("생산자" +this.getMaker());
        System.out.println("가격" +this.getPrice());
    }
    
}
