//Aufgabe: Count the number of Duplicates / Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
package countingDuplicates;

import java.util.Arrays;
import java.util.List;

public class CountingDuplicates {

	public static void main(String[] args) {
		int ergebnis = CountingDuplicates.duplicateCount("tesTe");
		System.out.println(ergebnis);
	}

	public static int duplicateCount(String text) {
		text = text.toLowerCase();
		// Wir brauchen eine Liste mit Zahlen und dem Alphabet
		List<String> list = Arrays.asList("0","1","2","3","4","5","6","7","8","9","a","b","c","d","e",
				"f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y",
				"z");
		// Wir gehen die Liste mit Zahlen und dem Alphabet durch
		int ergebnis = 0;
		for (int i = 0; i < list.size(); i++) {
			String geprüfterWert = list.get(i);
			String[] buchstabenListe = text.split("");
			// Bei jedem Buchstaben/Zahl der Liste prüfen wir ob diese auch mehrfach im
			// übergebenen Text ist
			int vorkommen = 0;
			for (int j = 0; j < buchstabenListe.length; j++) {
				String textWert = buchstabenListe[j];
				if (textWert.equals(geprüfterWert)) {
					vorkommen++;
				}

			}
			// wenn ja: mach einen strich auf der strichliste
			if (vorkommen > 1) {
				ergebnis++;
			}
		}
		return ergebnis;
	}
}
