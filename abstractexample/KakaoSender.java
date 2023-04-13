package abstractexample;

public class KakaoSender extends ContentSender {

	private String content;
    // 생성자를 만들었음에도 불구하고 오류가 난다 ? -> sendMessage를 오버라이딩해야 한다.
	public KakaoSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}

    // add unimplemented method 미구현 메서드를 생성한다. -> 오버라이딩으로 sendMessage매서드가 생긴다.
	//조상클래스의 추상메서드를 오버라이딩함.
	@Override
	public void sendMessage(String recipient) {	
		System.out.println("제목 : " + this.getTitle());
		System.out.println("이름 : " + this.getName());
		System.out.println("내용 : " + this.getContent());
		System.out.println("받는사람 : " + recipient);
	}	
}
