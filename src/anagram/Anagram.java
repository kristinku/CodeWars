package anagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean ergebnis = Anagram.isAnagram("Foefet", "toffee");
		System.out.println(ergebnis);
	}

	public static boolean isAnagram(String test, String original) { //Lösungsweg: Buchstaben sortieren und vergleichen
		char[] stringtoCharTest = test.toLowerCase().toCharArray();
		char[] stringtoCharOriginal = original.toLowerCase().toCharArray();
		 Arrays.sort(stringtoCharTest);
		 Arrays.sort(stringtoCharOriginal);
		 boolean result = Arrays.equals(stringtoCharTest, stringtoCharOriginal);
		return result;
	}
	
}
