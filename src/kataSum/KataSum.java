/*
 * Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
 * The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
 * Mind the input validation.
 * If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
  */

package kataSum;

public class KataSum {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 11, 2, 3};
		int endresult = KataSum.sum(numbers);
		System.out.println(endresult);
	}
	  public static int sum(int[] numbers) {
		  if(numbers == null || numbers.length <= 1) {
			  return 0;
		  }
		  int kleinsteZahl = numbers[0]; //Start bei 0, weil es die erste Position im Array ist.
		  int größteZahl = numbers[0];
		  for(int i = 0; i < numbers.length; i++) {
			  if(numbers[i] < kleinsteZahl) {
				  kleinsteZahl = numbers[i];
			  }
			  if(numbers[i] > größteZahl) {
				  größteZahl = numbers[i];
			  }
		  }
		  int summe = 0;
		  for(int j = 0; j < numbers.length; j++) {
			summe = summe + numbers[j];  
		  }
	    return summe - (kleinsteZahl + größteZahl);
	  }
}
