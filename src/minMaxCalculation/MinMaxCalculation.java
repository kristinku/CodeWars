//Write a function that returns both the minimum and maximum number of the given list/array. 

package minMaxCalculation;

import java.util.Arrays;

public class MinMaxCalculation {
	public static void main(String[] args) {
		int[] numbers = {1,6,8,3,5};
		int[] minMaxNumbers = MinMaxCalculation.minMax(numbers);
		System.out.println(Arrays.toString(minMaxNumbers));
	}
	
	  public static int[] minMax(int[] arr) {
		  int minNumber = arr[0];
		  int maxNumber = arr[0];  
		  for(int number : arr) {
			  if(number < minNumber) {
				  minNumber = number;
			  }
			  if(number > maxNumber) {
				  maxNumber = number;
			  }
		  }
		  int[] newArr = {minNumber, maxNumber};
		  return newArr;
	    } 
}
