//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//For example, for [1, 2, 2] it should return 9 because 1² + 2² + 2² = 9.

package squareSum;

import java.util.Arrays;

public class SquareSum {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5 };
		int resultOfSquareSum = SquareSum.squareSum1(numbers);
		System.out.println(resultOfSquareSum);
	}

	public static int squareSum(int[] n) {
		int sum = 0;
		for(int i = 0; i < n.length; i++) {
			sum = sum + (n[i]*n[i]);
		}
		return sum;
	}
	
	public static int squareSum1(int[] n) {
		int sum = 0;
		for(int number:n) {
		//Die erste Stelle der Klammer der schnelle for Schleife ist: variable vom Typ/Klasse (was ein Element der Liste hat) und neuer variablenname: hier int number
		//Nach dem Doppelpunkt wird die Liste/Array angegeben über die die for Schleife gehen soll. hier n.
		//Ausprache der Schleife: Für alle number in der Liste n mach... {
			sum = sum + (number*number);
		}
		
		return sum;
	}
	
	public static int squareSum2(int[] n) {
		int sum = 0;
		for(int number:n) {
			sum = (int) (sum + Math.pow(number, 2)); //wir casten das double welches von Math.pow zurück gegeben wird in einen int.
		}
		return sum;
	}
	
	public static int squareSum3(int[] n) {
		return Arrays.stream(n) //Erstellt aus primitiven int[] ein int stream, mit Hilfe der Arrays Klasse weil arrays kaum Funktionen haben
				.map(number -> number*number) // Map: wandelt jedes Element im stream in etwas neues um. In diesen Fall Number * Number (number²) Hier wird das Element als number benannt(der Typ int wird weg gelassen da der stream den Typ bereits weiß)
				.sum(); // Anschließend summieren wir alle Elemente unseres streams.
		
	}
}
