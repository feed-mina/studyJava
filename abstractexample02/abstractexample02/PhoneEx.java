package abstractexample02;

public class PhoneEx {
    // 2023-04-14
	public static void main(String[] args) {
		//추상클래스는 인스턴스를 생성할 수가 없다.
		//Phone phone = new Phone();
		Phone[] p = new Phone[10];			
		p[0] = new SmartPhone(190815, "홍길동", "LG-V50");
		p[1] = new FolderblePhone(190820, "티아라", "SAMSUNG-FOLDEBLE-20");
        // 근본 = 자신의 필드(객체)
		//근본이 Phone이니깐 SmartPhone이나 FolderblePhone폰에 선언되어 있는
		//메서드는 사용을 못한다.근본이 Phone이니깐
		p[0].turnOff();
		p[0].showInfo();
		
		System.out.println("--------------------------------");
		
		p[1].turnOff();
		p[1].showInfo();
		
		System.out.println("--------------------------------");
		
		SmartPhone smartPhone = new SmartPhone(190815, "홍길동", "LG-V50");
		smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		System.out.println("--------------------------------");
		
		FolderblePhone fPhone = new FolderblePhone
								(190820, "티아라", "SAMSUNG-FOLDEBLE-20");
		fPhone.showInfo();
		fPhone.turnOn();
		fPhone.turnOff();
		fPhone.foldOn();
		fPhone.foldOff();
	}
}
