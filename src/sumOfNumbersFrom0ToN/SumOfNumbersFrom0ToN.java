//We want to generate a function that computes the series starting from 0 and ending until the given number.
//Example Input: >6; Output: 0+1+2+3+4+5+6 = 21
//Input: > -15; Output: -15<0
//Input: > 0; Output: 0=0

package sumOfNumbersFrom0ToN;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbersFrom0ToN {
	public static void main(String[] args) {
		String zeroToN = SumOfNumbersFrom0ToN.showSequence(5);
		System.out.println(zeroToN);
	}

	public static String showSequence(int value) {
		if (value == 0) {
			return "0=0";
		}
		if (value < 0) {
			return value + "<0";
		}
		List<String> calculate = new ArrayList<String>();
		int sum = 0;
		for (int i = 0; i <= value; i++) {
			sum = sum + i;
			if (i < value) {
				calculate.add(String.valueOf(i));
				calculate.add("+");
			} else {
				calculate.add(String.valueOf(value));
				calculate.add("=");
				calculate.add(String.valueOf(sum));
			}
		}
		return calculate.toString().replaceAll("[\\[\\]]", "").replaceAll(",", "").replaceAll(" ", "").replaceAll("="," = ");
	}
}
