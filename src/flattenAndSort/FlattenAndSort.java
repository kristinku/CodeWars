/*
Given a two-dimensional array of integers, return the flattened version of the array with all the integers 
in the sorted (ascending) order.
Example:Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

package flattenAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenAndSort {
	public static void main(String[] args) {
		int[][] value1 = new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}; //Array erstellen mit Werten (initialisieren)
		int[] endresult = FlattenAndSort.flattenAndSort(value1);
		System.out.println(Arrays.toString(endresult)); //int sind zu dumm zu wissen wie sie als Text angezeigt werden. Deswegen braucht man Hilfsfunktion die einen String erstellt.
	}
	public static int[] flattenAndSort(int[][] array) {		
		List<Integer> value2 = new ArrayList<>(); 
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				value2.add(array[i][j]);
			}
		}
		int[] value3 = new int [value2.size()];
		for(int k = 0; k < value2.size(); k++) {
			value3[k] = value2.get(k);
		}
		Arrays.sort(value3);
		return value3;		
	}
}
