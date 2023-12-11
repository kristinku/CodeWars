//You will be given an array of numbers. You have to sort the odd numbers in ascending 
//order while leaving the even numbers at their original positions.
//Examples
//[7, 1]  =>  [1, 7]
//[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
//[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0

package kataSortArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KataSortArray2 {
	public static void main(String[] args) {
		int[] value = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] endresult = KataSortArray2.sortArray(value);
		System.out.println(Arrays.toString(endresult));
	}

	public static int[] sortArray(int[] array) { //Funktion(Methode)
		List<Integer> oddNumbers = KataSortArray2.safeOddNumbers(array);
		
		oddNumbers.sort(Comparator.naturalOrder()); //Funktionsaufruf zum sortieren der ungeraden Zahlen
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 > 0) { // Schleife(Befehl) ersetzten ungerade Zahlen im array mit Liste neu&sortieren ungeraden Zahlen
									
				array[j] = oddNumbers.remove(0);
			
			}
		}
		return array;
	}
	
	public static List<Integer> safeOddNumbers(int[] array) { //Funktion(Methode)
		List<Integer> oddNumbers = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 > 0) { // Schleife(Befehl) um ungerade Numbers in neue List zu speichern
				oddNumbers.add(array[i]);
			}
		}
		return oddNumbers;
	}
}
