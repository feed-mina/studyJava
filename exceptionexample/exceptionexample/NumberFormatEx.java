package exceptionexample;

// 2023-04-24
public class NumberFormatEx {
    
    public static void main(String arg) {
	
        String str1 = "100";
        String str2 = "100가";
        
        System.out.println(str1 + ","+ str2);
        
        int value1 = Integer.parseInt(str1);
        // 문자를 숫자로 바꿔준다.
        int value2 = Integer.parseInt(str2);
        int result = value1 + value2;
         System.out.println(value1);
         System.out.println(value2);
        System.out.println(result);
        
        
	}

}
