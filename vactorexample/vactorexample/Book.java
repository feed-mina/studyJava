package vactorexample;

public class Book extends Product02 {
    private int ISBN;
    private String title;
    private String author;
    
    public Book(int productID, String description, String maker, int price, int ISBN, String title, String author) {
        super(productID, description, maker, price);
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    public int getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public void showInfo(){
        super.showInfo(); // 조상클래스의 메서드를 명시적 호출
        System.out.println("국제표준도서번호"+this.getISBN());
        System.out.println("책 제목"+this.getTitle());
        System.out.println("저자"+this.getAuthor());
    }
}
