
package Singleton;
import java.util.Calendar;
import java.util.Date;
public class UserEx {
    public static void main(String[] args){
    // 싱글톤 예제 2023-04-11
    //User iser1 = new User();
    User user1 = User.getInstance();
    User user2 = User.getInstance();
    
    //싱글톤 패턴을 사용하는 실제적인 예
    Calendar cal = Calendar.getInstance();
        
   Date d = cal.getTime();
    System.out.println(d);
        
    System.out.println("user1의 주소: " + user1);
    
    System.out.println("user2의 주소" +user2);
    // Object클래스의 equals() 주소 비교
    // 객체의 == 연산은 주소값 비교 연산
    // if(user1 == user2){}
    if(user1.equals(user2)){
        System.out.println("같은 객체입니다.");
        
    }else {
        System.out.println("다른 객체입니다.");
    }
    // 싱글톤패턴을 사용하는 이유 
    // 단, 하나의 인스턴스를 생성해서 서로 공유를 원하고자 할때 사용
    // ex) 사용자 환경설정, 커넥션 풀, 스레드풀, OS의 시간이나 날짜 등
    }
}
