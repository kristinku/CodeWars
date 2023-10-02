//https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java

package countByX;

import java.util.Arrays;

public class CountByX {
	public static void main(String[] args) {
		int[] result = CountByX.countBy(2, 5);
		System.out.println(Arrays.toString(result));
		
	}
	
	  public static int[] countBy(int x, int n){
		  int[] numbers = new int[n];
		  for(int i = x, j = 0; j < n; i+=x, j++) {
			  numbers[j] = i;
		  }
		  
		    return numbers;
		  }
}
