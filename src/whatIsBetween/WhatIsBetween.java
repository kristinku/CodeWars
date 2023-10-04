//Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between 
//the input parameters, including them. Example a = 1, b = 4 --> [1, 2, 3, 4]

package whatIsBetween;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WhatIsBetween {
	public static void main(String[] args) {
		int[] numbersBetween = WhatIsBetween.between(1, 4);
		System.out.println(Arrays.toString(numbersBetween));
	}

	public static int[] between(int a, int b) {
		int[] numbers = new int[b - a + 1];
		for (int i = a, j = 0; i <= b; i++, j++) {
			numbers[j] = i;
		}
		return numbers;
	}

	// Alternative Lösung mit Stream von Codwars:
	public static int[] between2(int a, int b) {
		return IntStream.rangeClosed(a, b)
						.toArray();
	}
}
