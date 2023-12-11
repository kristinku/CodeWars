// It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. 
// You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

package removeChars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveChars {
	public static void main(String[] args) {
		String newString = RemoveChars.remove1("Baum");
		System.out.println(newString);
	}
		//erste Lösung
	  public static String remove(String str) {
		  str = str.substring(1, str.length() - 1); 

		  return str;
	 
	    }
	  //anderer Lösungsweg (erste Idee aber ohne Hilfe noch nicht umgesetzt bekommen):
	  public static String remove1(String str) {
		  char[] arrayChar = str.toCharArray(); //String in char[] umwandeln
		  List<Character> list = new ArrayList();//char[] in Liste umwandeln, weil Liste mehr Funktionen hat. Hier wird erstmal eine leere Liste erstellt
		  for(char charOfarray : arrayChar) {
			  list.add(charOfarray); //Liste wird hier mit chars aus char[] befüllt.
		  }
		  list.remove(0);
		  list.remove(list.size()-1);
		  return list.stream().map(c -> String.valueOf(c)).collect(Collectors.joining());
	  }
 
}
