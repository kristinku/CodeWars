//Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. 
//If the two numbers are equal return a or b.

package sumOfNumbers;

import java.util.Arrays;

public class SumOfNumbers {
	public static void main(String[] args) {
		SumOfNumbers objectOfClass = new SumOfNumbers(); //Da Funktion nicht static ist muss ein Objekt für den Funktionsaufruf von der Klasse erstellt werden.
		int endresult = objectOfClass.GetSum(1, 1);
		System.out.println(endresult);

	}
	   public int GetSum(int a, int b){ 
		   int sum = 0;
		   int[] n = new int[]{a,b};
		   Arrays.sort(n);
		   for(int i = n[0]; i <= n[1]; i++) { // <= das Istgleich muss hinter < da sonst (bsp. a=1 b=2) das i nie bei 2 ankommt. Sondern nur bis 1 zählt.
			  sum = sum + i; 
		   }
		   return sum;
	   }
}
// Lösung von einen aus Codewarse mit Math Klasse:
//public int GetSum(int a, int b) {
//    int res = 0;
//    for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//      res += i;
//    }
//    return a == b ? a : res;
//  }
