//Given an array of integers as strings and numbers, return the
//sum of the array values as if all were numbers.
//Return your answer as a number.
// LÖSUNG ist nicht optimal, weil die Liste Zahlen und Strings beihalten sollte, wir haben es um
//geändert nur in Strings. 


package sumMixedArray;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
	public static void main(String[] args) {
		String[] array = {"5", "2", "9"}; 
		List<String> list = Arrays.asList(array);
		SumMixedArray sumMixedArray = new SumMixedArray();
		int summe = sumMixedArray.sum(list);
		System.out.println(summe);
	}
	
	public int sum(List<String> mixed) {	
		int ergebnis = 0;
		for (int i = 0; i<mixed.size(); i++) {
			Integer zahl = Integer.parseInt(mixed.get(i));
            ergebnis = zahl + ergebnis;  
        }
		
		return ergebnis;
	}
}
