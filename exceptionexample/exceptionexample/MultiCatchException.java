package exceptionexample;
// 2023-04-24
import java.util.Arrays;

public class MultiCatchException {
    
    public static void main(String[] args) {
        
        try {
                int[] arr = new int[3];
                System.out.println(Arrays.toString(arr));
              //  arr[3] = 100; // 예외발생
                int result = 10/0; // 예외 발생
            	System.out.println(result);
            // 	}catch(Exception e){
            //     System.out.println("예외발생");
       }
        // catch 구문에서 항상 Exception 클래스는 맨 마지막에 와야 한다.
        catch (ArrayIndexOutOfBoundsException e) { // Unrechable 오류 
            System.out.println("배열의 인덱스를 초과할 수 없습니다.");
        // }catch(ArithmeticException e){
        // System.out.println("0으로 나눌 수 없습니다.");
 		}catch(Exception e){
            System.out.println("예외발생");
        }finally{
            System.out.println("종료");

        }
    }
}
