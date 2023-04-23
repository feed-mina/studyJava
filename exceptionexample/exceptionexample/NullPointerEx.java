package exceptionexample;

public class NullPointerEx {
    
    public static void main(String arg) {
	
        String str = null; // 객체가 없는데 객체의 인스턴스에 있는 toString도 당연히 호출할 수 없다.
        
        //이 예외는 객체(인스턴스)가 없는데 어떻게 인스턴스에 있는 toString()을 호출하니?
        
        try{
        System.out.println(str.toString());
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    	
        // Error: Main method not found in class exceptionexample.NullPointerEx, please define the main method as:
   		// public static void main(String[] args)
}

}
