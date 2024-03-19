//Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .
//Notes: Array/list will contain positives only. Array/list will always have even size.
//Example: minSum({5,4,2,3}) ==> return (22) Explanation: The minimum sum obtained from summing each two integers product ,  5*2 + 3*4 = 22

package minimizeSumOfArray;

import java.util.Arrays;

public class MinimizeSumOfArray {
	public static void main(String[] args) {
		int[] numbers = {12,6,10,26,3,24};
		int sum = MinimizeSumOfArray.minSum(numbers);
		System.out.println(sum);
	}
	
	  public static int minSum(int[] passed){
		  Arrays.sort(passed);
		  int sum = 0;
		  for(int i = 0, j = passed.length-1; i <= j; i++, j--) { // i und j sind Zähler 
			  sum = sum + passed[i]*passed[j];
		  }
		  return sum;
	  }
	         
}
