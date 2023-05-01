//Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. 
//If the array does not contain any numbers then you should return 0.

package sumArrays;

public class SumArrays {

	public static void main(String[] agrg) {
		double[] werte = { 1, 5.2, 4, 0, -1 };
		double ergebnis = SumArrays.sum(werte);
		System.out.println(ergebnis);
	}

	public static double sum(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++)
			sum = sum + (numbers[i]);
		
		return sum;
	}
}

