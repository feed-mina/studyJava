package InstanceOfexample;
//자손클래스 - 조상클래스의 기본 클래스 컴파일만 추가되기 때문에 에러가 안나온다.
public class SportCar extends Car {
	
	public void speedUp() {
		System.out.println("속도를 올립니다.");
	}
}
