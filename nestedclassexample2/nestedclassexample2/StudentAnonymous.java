package nestedclassexample2;
// 2023-04-23
// 맴버변수의 매개값, 필드의 초기값을 준다.
public class StudentAnonymous {
    
    // 필드의 초기값
    Student student1 = new Student("홍길동"){
        // 익명 자손 클래스의 영역 
        // 익명 자손객체의 맴버메서드
        public void goSchool(){
            System.out.println(this.name + "이 등교합니다.");
        }
        
        @Override
        public void wake(){
            System.out.println("--------------------");
            System.out.println("필드의 초기값 형태로 만들어진 익명자손객체");
            System.out.println(this.name + "이 일어납니다.");
            this.goSchool();
            System.out.println("--------------------");
        }
    }; 
    
    // 로컬변수값
    public void method1(){
        Student lstudent = new Student("김연아"){
            public void goSkate(){
                System.out.println(this.name + "가 연습하러 스케이드장에 갑니다.");
            }
            @Override
            public void wake(){
            System.out.println("--------------------");
            System.out.println("로컬변수의 초기값 형태로 만들어진 익명자손객체");
             System.out.println(this.name + "이 일어납니다.");
			this.goSkate();               
            System.out.println("--------------------");
            }
        };
    
    lstudent.wake();
	}
    
    // 매서드의 매개변수 값
    public void method2(Student student){
        student.wake(); // 매서드의 매개변수 값이나 익명자손클래스로 값을 넘긴다.
    }
    
}