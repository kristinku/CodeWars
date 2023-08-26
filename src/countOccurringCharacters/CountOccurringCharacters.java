/*
 * The main idea is to count all the occurring characters in a string. 
 * If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
 * What if the string is empty? Then the result should be empty object literal, {}.
 */


package countOccurringCharacters;

import java.util.HashMap;
import java.util.Map;

public class CountOccurringCharacters {
	public static void main(String[] args) {
		String word = "Brettspiel";
		Map<Character, Integer> countedCharacters = CountOccurringCharacters.count(word);
		System.out.println(countedCharacters);
	}
	
    public static Map<Character, Integer> count(String str) {
        HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
        for(char letter : str.toLowerCase().toCharArray()) { //schnelle for Schleife
        	if(characters.containsKey(letter)) {
        		int amount = characters.get(letter);
        		amount++;
            	characters.put(letter, amount);
        	}else {
        		characters.put(letter, 1);
        	}
        	
        }
        return characters;
    }
}
