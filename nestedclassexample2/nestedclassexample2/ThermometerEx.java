package nestedclassexample2;

// 2023-04-23
public class ThermometerEx {

	public static void main(String[] args) {
		
		Thermometer thermometer = new Thermometer();
		thermometer.setChangabe(new AnalogThemometer());
		thermometer.viewTemperature();
		
		thermometer = new Thermometer();
		thermometer.setChangabe(new DigitalThemometer());
		thermometer.viewTemperature();

		//중첩인터페이스이므로 익명구현 객체를 얻는 것은 안된다.
//		Thermometer.TemperatureChangable thermometer2 = new Thermometer.TemperatureChangable() {
//			@Override
//			public void OnChange() {
//				System.out.println("익명구현객체로 만든");		
//			}
//		};
//		Thermometer t = (Thermometer)thermometer2;
//		t.viewTemperature();
	}

}
