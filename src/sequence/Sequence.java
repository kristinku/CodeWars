//Build a function that returns an array of integers from n to 1 where n>0.
//Example : n=5 --> [5,4,3,2,1]


package sequence;

import java.util.Arrays;

public class Sequence {
	public static void main(String[] args) {
		int[] reverseArray = Sequence.reverse(5);
		System.out.println(Arrays.toString(reverseArray));
	}
	
	  public static int[] reverse(int n){
		  int[] arr = new int[n];
		  for(int i = n, j = 0; i >= 1; i--, j++) {
			  arr[j] = i;
		  }
		  return arr;
		  }
}
