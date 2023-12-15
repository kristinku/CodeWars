//Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
//Example:
//Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

package jadenCase;

import java.util.Arrays;
import java.util.stream.Collectors;


public class JadenCase {
	public static void main(String[] args) {
		JadenCase objectJadenCase = new JadenCase(); //Da Funktion nicht static ist muss ein Objekt für den Funktionsaufruf von der Klasse erstellt werden.
		String sentenceInJC = objectJadenCase.toJadenCase("How can mirrors be real if our eyes aren't real");
		System.out.println(sentenceInJC);
	}
	
	public String toJadenCase(String phrase) {
		if(phrase == null || phrase.isEmpty()) {
			return null;
		}
		String[] phraseArray = phrase.split("");
		phraseArray[0] = phraseArray[0].replace(phraseArray[0], phraseArray[0].toUpperCase());
		for(int i = 0; i < phraseArray.length; i++) {
			if(phraseArray[i].equals(" ")) {
				phraseArray[i+1] = phraseArray[i+1].replace(phraseArray[i+1], phraseArray[i+1].toUpperCase());
			}
		}
		 return Arrays.stream(phraseArray).collect(Collectors.joining());	
	}
}
