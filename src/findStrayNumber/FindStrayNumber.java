//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//Complete the method which accepts such an array, and returns that single different number.
//The input array will always be valid! (odd-length >= 3) Examples: [1, 1, 2] ==> 2 [17, 17, 3, 17, 17, 17, 17] ==> 3

package findStrayNumber;

import java.util.Arrays;

public class FindStrayNumber {
	public static void main(String[] args) {
		int[] arrayOfnumbers = { 1, 2, 1 };
		int strayNumber = FindStrayNumber.stray(arrayOfnumbers);
		System.out.println(strayNumber);
	}

	static int stray(int[] numbers) {
		Arrays.sort(numbers);
		if (numbers[0] == numbers[1]) {
			return numbers[numbers.length - 1];
		} else {
			return numbers[0];
		}
	}

}
