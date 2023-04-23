package exceptionexample;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsEx {
    
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        
        for(int i = 0; i<6; i++){
            arr[i] = 10;
            // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        	// at exceptionexample.ArrayIndexOutOfBoundsEx.main(ArrayIndexOutOfBoundsEx.java:12)
        	// i가 5일때 예외 발생될꺼라고 예상.
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        
    }
}
