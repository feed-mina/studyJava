package nestedclassexample2;

// 2023-04-23
//중첩인터페이스를 구현한 클래스
public class AnalogThemometer implements Thermometer.TemperatureChangable {

	int temperture = 100;
	
	@Override
	public void OnChange() {
		System.out.println("아날로그 온도계입니다.");
		System.out.println(this.temperture + "도 입니다.");		
	}
}
