//Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

package shortcut;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Shortcut {
	public static void main(String[] args) {
		String word = "Hallo";
		String shortcutWord = Shortcut.shortcut(word);
		System.out.println(shortcutWord);
	}
	
	  public static String shortcut(String input) {
		  return Arrays.stream(input.split("")) //Input.split erstellt einen String[] und mit Arrays.stream erstellen wir daraus einen Stream.Ein Stream ist wie eine Schleife. Arrays.Stream kommt nicht mit einen Char[] zurecht, deshalb haben wir nicht String.toCharrArray verwendet 
				  .filter(c -> !"aeiou".contains(c))//mit der Stream Funktion .filter wählen wir alle Elemente im Stream aus die bleiben sollen. Hier wählen wir alle Buchstabe aus die nicht in String "aeiou" vorkommen sollen. 
				  .collect(Collectors.joining ()); //Alle Elemente des String Stream zu einen String zusammenfügen.
		    
		  }
}
