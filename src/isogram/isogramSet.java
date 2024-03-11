package isogram;

import java.util.HashSet;
import java.util.Set;

public class isogramSet {
	public static void main(String[] args) {
			boolean trueOrFalse = Isogram.isIsogram("Affe");
			System.out.println(trueOrFalse);
	}
	
    public static boolean  isIsogram(String str) {
    	str = str.toLowerCase();
    	Set<Character> letters = new HashSet<>();
    	for(Character c : str.toCharArray()) { 	//str.toCharArray wird hier genutzt um Liste für Schleife zu erstellen, kurze for schleife braucht Liste um drüber zu gehen
    		letters.add(c);
    	}
    	return str.length() == letters.size();
    }

}
