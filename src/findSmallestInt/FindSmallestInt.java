//Given an array of integers your solution should find the smallest integer.
//For example:
//    Given [34, 15, 88, 2] your solution will return 2
//    Given [34, -345, -1, 100] your solution will return -345
//You can assume, for the purpose of this kata, that the supplied array will not be empty.

package findSmallestInt;

import java.util.Arrays;
import java.util.Objects;

public class FindSmallestInt {
	public static void main(String[] args) {
		int[] value = { 34, 15, -10, 100 };
		int endresult = FindSmallestInt.findSmallestInt(value);
		System.out.println(endresult);
	}
// Meine Lösung:
	public static int findSmallestInt(int[] args) {
		Arrays.sort(args);	
		return args[0];
	}
// Andis Lösung: 
//	public static int findSmallestInt(int[] args) {
//		Integer kleinsterWert = null;
//		for (int i = 0; i < args.length; i++) {
//			if(Objects.isNull(kleinsterWert) || args[i] < kleinsterWert) {
//				kleinsterWert = args[i];
//			}
//		}
//		return kleinsterWert;
//		}

}