package abstractexample;

//추상클래스란? 1개이상의 추상메서드를 포함하는 클래스를 추상클래스
//추상클래스는 인스턴스를 절대로 생성할 수가 없다.
//추상메서드는 선언부만 존재하고 구현부가 없는 것
public abstract class ContentSender {

	private String title;
	private String name;
	
	//생성자
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}
    
    // private 멤버변수는 get매서드를 사용해서 접근할 수 있다.
	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
    
    // 추상메서드는 접근제어자를 public으로 해야한다. (private를 사용하면 접근할 수 없다.)
    // 추상메서드는 선언부만 있고 구현부는 없다.
	//추상메서드->상속을 통해서 반드시 재정의가 되어야 비로소
	//인스턴스를 생성할 수 있다.
	public abstract void sendMessage(String content);	
}