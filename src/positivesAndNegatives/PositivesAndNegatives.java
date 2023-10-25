//Given an array of integers. Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//If the input is an empty array or is null, return an empty array. Example: For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

package positivesAndNegatives;

import java.util.Arrays;

public class PositivesAndNegatives {
	public static void main(String[] args) {
		int[] numbers = {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
		int[] sums = PositivesAndNegatives.countPositivesSumNegatives(numbers);
		System.out.println(Arrays.toString(sums));
	}

	public static int[] countPositivesSumNegatives(int[] input) {
		int count = 0; 
		int sumNegativ = 0;
		if(input == null || input.length == 0) {
			 return new int[0];
		}
		for (int number : input) {
			if (number > 0) {
				count++;
			} else if (number < 0) {
				sumNegativ = sumNegativ + number;
			}
		}	
		int[] arr = {count, sumNegativ};
		return arr;
	}

}