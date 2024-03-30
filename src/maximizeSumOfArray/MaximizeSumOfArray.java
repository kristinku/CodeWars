//Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .
package maximizeSumOfArray;

import java.util.Arrays;

public class MaximizeSumOfArray {
	public static void main(String[] args) {
		int[] numbers = {-2,0,5};
		int size = 3;
		long maxSum = MaximizeSumOfArray.maxProduct(numbers, size);
		System.out.println(maxSum);
	}
	
    public static long maxProduct(int[] numbers, int sub_size) {
       Arrays.sort(numbers);
       long sum = 0;
       for(int i = numbers.length-1; sub_size > 0; sub_size--, i--) {
    	   if(i == numbers.length -1) {
    		   sum = numbers[i];
    	   } else {
    		   sum = sum * numbers[i];
    	}   
       }
    	return sum; 
    }
}
