//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//Bsp: highAndLow("1 2 3 4 5")  // return "5 1";  highAndLow("1 2 -3 4 5") // return "5 -3

package highestAndLowest;

import java.util.Arrays;

public class HighestAndLowest {
	public static void main(String[] args) {
		String endresult = HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
		System.out.println(endresult);
	}

	public static String highAndLow(String numbers) {
		String[] n = numbers.split(" ");
		int[] nAsInt = Arrays.stream(n).mapToInt(Integer::parseInt).toArray(); // (Integer::parseInt) ist ein Funktionsaufruf der Funktion parseInt in der Klasse Integer. (i -> Integer.parseInt(i) ist die lange schreibweise davon.
		Arrays.sort(nAsInt);
		return nAsInt[nAsInt.length - 1] + " " + nAsInt[0];
	}
}
//
//Lösung von einen aus Codewars mit stream und summarystatistics:
//
//static String highAndLow(String numbers) {
//    var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
//    return stats.getMax() + " " + stats.getMin();
//  }
// summaryStatistics: This computes, in a single pass, the count of people, as well as the minimum,
// maximum, sum, and average of their number of dependents.
// Anstelle von var könnte da auch IntSummaryStatistics für stats da stehen.
// Durch die Klasse IntSummaryStatistics kann bei stats dann Funktion getMax und get Min ausgeführt werden
// Die es so bei Typ int oder anderen primitiven Datentypen nicht gibt. 