package invert;

import java.util.Arrays;

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

public class Invert {
	public static void main(String[] args) {
		int[] numbers = { 1, -2, 3, -4, 5 };
		int[] oposite = Invert.invert(numbers);
		System.out.println(Arrays.toString(oposite));
	}

	public static int[] invert(int[] array) {
		int[] opositeNumbers = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			opositeNumbers[i] = array[i] * -1;
		}
		return opositeNumbers;
	}
}
// Funkton ohne extra variable: OpositeNumbers wird nicht gebraucht wir die Werte im Array direkt überschreiben können.
//	public static int[] invert(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			array[i] = array[i] * -1;
