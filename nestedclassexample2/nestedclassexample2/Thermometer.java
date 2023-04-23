package nestedclassexample2;

// 2023-04-23
public class Thermometer {
	
	//중첩 인터페이스 선언
	interface TemperatureChangable {
		public void OnChange();
	}
	
	TemperatureChangable changable;

	//매개변수 타입이 인터페이스 타입이 들어왔다.이것은 무엇을 의미하는건가요?
	//즉, TemperatureChangabe인터페이스를 구현한 클래스만 들어올 수 있다.
	//인터페이스 매개변수의 다형성이죠.
	public void setChangabe(TemperatureChangable changable) {
		this.changable = changable;
	}
	
	public void viewTemperature() {
		this.changable.OnChange();
	}	
}