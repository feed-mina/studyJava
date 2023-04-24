package exceptionexample;
// 2023-04-24
public class ThrowAndThrowsEx {
    public static void main(String[] args) {
    boolean result = false;
           
       try{
            findClass();
       		if(result){
                System.out.println("클래스가 존재합니다.");
            }
       } catch (ClassNotFoundException e){
           System.out.println(e.getMessage());
           System.out.println("클래스가 존재하지 않습니다");
           e.printStackTrace();
       } catch(Exception e){
           // 개발자용 , 배포시에는 제거나 주석처리를 해야 한다.
           e.printStackTrace();
    } finally{
        System.out.println("정상종료합니다");
    }
}  
    
    // public static void findClass() throws ClassNotFoundException {
    //     Class class1 = Class.forName("java.lang.String");
	// }
    public static boolean findClass() throws ClassNotFoundException {
         Class class1 = Class.forName("java.lang.String");
        // Class class1 = Class.forName("java.lang.String1");
                                                //                 at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
                                                //         at java.lang.Class.forName0(Native Method)
                                                //         at java.lang.Class.forName(Class.java:264)
                                                //         at exceptionexample.ThrowAndThrowsEx.findClass(ThrowAndThrowsEx.java:29)
                                                //         at exceptionexample.ThrowAndThrowsEx.main(ThrowAndThrowsEx.java:8)
                                                // 정상종료합니다
        
        
        // 클래스가 있다면..
        if(class1 != null)
            return true;
        else // 클래스가 없다면..
            return false;
    }



}
