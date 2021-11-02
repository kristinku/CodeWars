package odd_or_even;

public class OddOrEven {

	public static void main(String[] args) {
		int[] zahlenliste = { 1, 2, 3, 4 };
		String ergebnis = OddOrEven.oddOrEven(zahlenliste);
		System.out.println(ergebnis);
	}

	public static String oddOrEven(int[] array) {
		int listenlänge = array.length;
		int summe = 0;
		for (int i = 0; i < listenlänge; i++) {
			summe = summe + array[i];
		}
		if (summe % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}

	
	}
}
