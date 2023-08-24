/* 
 * Given the triangle of consecutive odd numbers:
 *           1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
1 -->  1
2 --> 3 + 5 = 8
 */

package rowSumOddNumbers;

import java.util.ArrayList;
import java.util.List;

public class RowSumOddNumbers {
	public static void main(String[] args) {
		int row = 10;
		int endresult = RowSumOddNumbers.rowSumOddNumbers(row);
		System.out.println(endresult);
	}

	public static int rowSumOddNumbers(int n) {
		int number = -1;
		int result = 0;
		for (int line = 1; line <= n; line++) {
			for (int numbersInLine = 1; numbersInLine <= line; numbersInLine++) {
				number = number + 2;
				if (line == n) {
					result = result + number;
				}
			}
		}
		return result;
	}
}
