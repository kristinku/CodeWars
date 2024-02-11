//Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.

package zywOo;

import java.util.Arrays;

public class ZywOo {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 5, 4, 5, 6, 8};
		int[] newArray = ZywOo.take(numbers, 10);
		System.out.println(Arrays.toString(newArray));
	}
	  public static int[] take(int[] arr, int n) {
		  if(arr.length == 0) {
			  return arr;
		  }
		  n = n > arr.length ? arr.length : n;
		  int[] newArr = new int[n];
		  for(int i = 0; i < n; i++) {
			  newArr[i] = arr[i];
		  }		
		  return newArr;
	  }
}
