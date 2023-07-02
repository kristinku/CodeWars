//Given a list of digits, return the smallest number that could be formed from these digits, 
//using the digits only once (ignore duplicates). Only positive integers will be passed to the function (> 0 ), no negatives or zeros.

package minimum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Minimum {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 2, 7 };
		int endresult = Minimum.minValue(numbers);
		System.out.println(endresult);
	}

	public static int minValue(int[] values) {
		List filteredValues = new ArrayList();
		for (int i = 0; i < values.length; i++) {
			if (!filteredValues.contains(values[i])) {	// ! vor boolean kehrt den boolean um. Aus true wird false und
														// umgekehrt
				filteredValues.add(values[i]); 			// Hier kommt true zurück, wegen den ! kommt jetzt false zurück.
			}
		}
		filteredValues.sort(Comparator.naturalOrder());
		String valuesAsString = "";
		for(int i=0; i < filteredValues.size(); i++) {
			valuesAsString = valuesAsString + filteredValues.get(i); 
		}
		return Integer.parseInt(valuesAsString);
	}
}
