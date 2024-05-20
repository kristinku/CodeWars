//Your job is to write a function which increments a string, to create a new string.
//If the string already ends with a number, the number should be incremented by 1.
//If the string does not end with a number. the number 1 should be appended to the new string.
//Examples: foo -> foo1     foobar23 -> foobar24

package stringIncrementer;

import java.math.BigInteger;


public class StringIncrementer {
	public static void main(String[] args) {
		String newString = StringIncrementer.incrementString("fo99obar99");
		System.out.println(newString);
		
	}
	
	public static String incrementString(String str) {
		String numberOnly = str.substring(StringIncrementer.getIndexOfNumbersstart(str));
		BigInteger number = null;
		try {
			number = new BigInteger(numberOnly).add(BigInteger.ONE);
		} catch(NumberFormatException e) {
			number = BigInteger.ONE;
		}
		String numberAsString = number.toString();
		int anzahlNull = numberOnly.length() - numberAsString.length();
		numberAsString = StringIncrementer.addLeadingZeros(anzahlNull, numberAsString);
		String textOnly = str.substring(0, StringIncrementer.getIndexOfNumbersstart(str));
		
		return textOnly + numberAsString;
	}
	
	public static int getIndexOfNumbersstart(String text) {
		String[] textArray = text.split("");
		for(int i = text.length()-1; i>=0; i--) {
			try {
				Integer.valueOf(textArray[i]); 
			} catch(NumberFormatException e) {
				return i+1; //wir fangen den fehler wenn unser Code keine Zahl mehr erkennt bsp. =. Dann geben wir die letzte Position hinter dem = zurück. Also den Index von 1. Beispiel Input: "Mkr-XU$|Z|+1'M2Fda=155181456920065742312105701261171"
			}
		}
		return 0;
	}
	
	public static String addLeadingZeros(Integer length, String text) {
		for(int i = 1; i <= length; i++) {
			text =  "0" + text;

		}
		return text;
	}
	
}
