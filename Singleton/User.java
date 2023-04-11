package Singleton;

public class User {
    
    private static User singleton = new User();
    private User(){
    }
    public void add(){
        System.out.println("add매서드 호출");
    }
    public static User getInstance(){
        return User.singleton;
    }
    
}
