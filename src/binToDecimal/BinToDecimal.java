//Complete the function which converts a binary number (given as a string) to a decimal number.

package binToDecimal;

public class BinToDecimal {
	public static void main(String[] args) {
		int result = BinToDecimal.binToDecimal("10101");
		System.out.println(result);
	}

	public static int binToDecimal(String inp) {
		String[] numbers = new StringBuilder(inp).reverse().toString().split("");
		int dezimal = 0;
		for (int i = 0; i < numbers.length; i++) {
			dezimal = numbers[i].equals("0") ? dezimal + 0 : dezimal + (int) Math.pow(2, i); // schnelles if, mit mathPow hochzahl
		}
		return dezimal;
	}
}
