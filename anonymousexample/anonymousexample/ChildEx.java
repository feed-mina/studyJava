package anonymousexample;

// 익명 자손 객체
public class ChildEx {
    public static void main (String[] args){
        
        // 익명자손객체(이름없음) -- UI 이벤트 처리나 스레드 객체 간편 생성
        Parent parent = new Parent(){ // 조상클래스가 생성 // 근본이 클래스
            // @Override 밑에 만들어진 인스턴스가 parent에 들어간다.
            
            int b = 10;
            public void method1(){
                System.out.println("익명자손객체 매서드");
            }
            @Override
            public void method(){
                int a = 10; //지역변수 선언
                System.out.println("a:"+a);
                System.out.println("b:"+this.b);
                this.method1();
            }
        };
        parent.method();
    }
}
