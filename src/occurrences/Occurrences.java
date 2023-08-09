/*
 * Create a function that accepts a string and a single character, and returns an integer of the count 
 * of occurrences the 2nd argument is found in the first one. If no occurrences can be found, a count of 0 should be returned.
 * ("Hello", "o")  ==>  1
 * ("Hello", "l")  ==>  2
 * ("", "z")       ==>  0
 */

package occurrences;

public class Occurrences {
	public static void main(String[] args) {
		String str = "Pfanne";
		char letter = 'n';
		int anzahlLetter = Occurrences.strCount(str, letter);
		System.out.println(anzahlLetter);
		
	}
	  public static int strCount(String str, char letter) {
		  int gezählteLetter = 0;
		  char[] arrayLetter = str.toCharArray();
		  for(int i = 0; i < arrayLetter.length; i++) {
			  if(arrayLetter[i] == letter) {
				  gezählteLetter = gezählteLetter + 1; 
			  }
		  }
	  return gezählteLetter; 
	  }
}
