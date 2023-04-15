package anonymousexample;

public class SoundEx {
    public static void main(String[] args){
        // 익명 구현 객체 (이름없음) 생성 -- UI 이벤트 처리나 스레드 객체 간편 생성
        Soundable soundable = new Soundable(){
            // 타입(근본)이 인터페이스이기 때문에 익명 구현객체가 된다. 
            // 아래는 익명 구현객체의 내부
            
            // 내부적으로 클래스니까 멤버들을 선언할 수 있다.
            // 하지만, 외부에서는 접근불가 (왜냐하면 근본이 뭔가? 인터페이스이기 때문이다.)
            int a = 10;
            public void method(){
                  System.out.println("익명구현객체 매서드 ");
            }
            @Override
            public void sound(){
                String str = "냄비";
                System.out.println("첫번째 익명구현객체 : "+str);
                System.out.println(str + "에 물을 담습니다.");
                System.out.println(str + "에 숟가락으로 탕탕 칩니다");
                this.method();
                System.out.println(this.a);

            }
        };
        soundable.sound();
        
        Soundable soundable1 = new Soundable(){
            // 타입(근본)이 인터페이스이기 때문에 익명 구현객체가 된다. 
            // 아래는 익명 구현객체의 내부
            // 잠시 잠깐 사용하는 매서드를 익명 구현객체로 사용한다.
            
            // 내부적으로 클래스니까 멤버들을 선언할 수 있다.
            // 하지만, 외부에서는 접근불가 (왜냐하면 근본이 뭔가? 인터페이스이기 때문이다.)
            int a = 20;
            public void method(){
                  System.out.println("밥그릇 익명구현객체 매서드 ");
            }
            @Override
            public void sound(){
                String str = "밥그릇";
                System.out.println("첫번째 익명구현객체 : "+str);
                System.out.println(str + "에 물을 담습니다.");
                System.out.println(str + "에 숟가락으로 탕탕 칩니다");
                this.method();
                System.out.println(this.a);

            }
        };
        soundable1.sound();
    }
}
