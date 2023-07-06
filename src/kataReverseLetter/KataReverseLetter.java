// Given a string str, reverse it and omit all non-alphabetic characters.
//A string consists of lowercase latin letters, digits and symbols.
//Example:  For str = "krishan", the output should be "nahsirk".  For str = "ultr53o?n", the output should be "nortlu".


package kataReverseLetter;


import java.util.List;
import java.util.ArrayList;


public class KataReverseLetter {
	public static void main(String[] args) {
	String word = "mar3k%";
	String endresult = KataReverseLetter.reverseLetter(word);
	System.out.println(endresult);
	}
	
	   public static String reverseLetter(final String str) {
		   List<Character> rightLetters = new ArrayList<>(); //richtige Buchstabenliste aus Schleife in Liste speichern, weil Listengröße flexibel ist. Char[] haben feste Größe  
		   char[] neuStr = str.toCharArray();
		   for(int i = 0; i < neuStr.length; i++) {
			   int asciivalue = (int) neuStr[i]; //in der Klammer ist der Typ in der die Variable gecastet werden soll
			   if(asciivalue >= 97 && asciivalue <= 122) {
				 rightLetters.add(neuStr[i]);  
			   }
		   }
		   String rightLettersAsAString = rightLetters.toString()
	                  .replaceAll(", ", "").replace("[" , "").replace("]", "");
		   return new StringBuilder(rightLettersAsAString).reverse().toString(); 
	    }
	   
	   public static String reverseLetterAndi(final String str) {
		   String result = "";
		   char[] characters = str.toCharArray();
		   for (int i = 0; i < str.length(); i++) { // Da str und char[] die gleiche Anzahl an Elemente/Buchstaben hat, ist es egal was ich hier bei length nehme.
			   if (Character.isLetter(characters[i])) {
				   result = result + characters[i];
			   }
		   }
		   return new StringBuilder(result).reverse().toString(); 
	   }
}
