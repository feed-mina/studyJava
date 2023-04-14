package interfaceExample;
//인터페이스의 본질은 추상메서드, static final은 부수적 개념
public interface A {
	int MAX = 10;   //static fianl생략가능하다.컴파일시에 컴파일러가 붙여준다.
	void method();  //public abstract생략가능하다.컴파일시에 컴파일러가 붙여준다.
}
