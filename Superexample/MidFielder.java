package example02;
//자손 클래스
public class MidFielder extends Player {
	
	private int pass;

	public MidFielder(String name, int age, int backNumber, int speed, int pass) {
		super(name, age, backNumber, speed); //Player의 생성자
		this.pass = pass;
	}
	
	public int getPass() {
		return this.pass;
	}
	
	@Override
	public void info() {
		super.info(); //player의 info를 호출
		System.out.println("패쓰 횟수 : " + this.getPass());	
	}
}