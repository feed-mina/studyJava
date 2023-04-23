package nestedclassexample2;

// 2023-04-23
//중첩인터페이스를 구현한 클래스
public class DigitalThemometer implements Thermometer.TemperatureChangable {

	int temperaure = 50;
	
	@Override
	public void OnChange() {
		System.out.println("전자 온도계입니다.");
		System.out.println(this.temperaure + "도 입니다.");		
	}
}
