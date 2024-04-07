//An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that 
//determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. 
//Ignore letter case. Example: (Input --> Output
//isIsogram "Dermatoglyphics" = true

package isogram;

import java.util.Arrays;

public class Isogram {
	public static void main(String[] args) {
		boolean trueOrFalse = Isogram.isIsogram("Array");
		System.out.println(trueOrFalse);
		
	}
    public static boolean  isIsogram(String str) {
    	char[] strAsChar = str.toLowerCase().toCharArray();
    	Arrays.sort(strAsChar);
    	for(int i = 1; i < strAsChar.length; i++) {
    		if(strAsChar[i] == strAsChar[i-1]) {
    			return false;
    		}
    	}
		return true;	
    } 
    
// Lösung von Codewars mit Set: (Set kann ein Buchstabe nur einmal vorkommen)
    
//    public class isogram {
//        public static boolean isIsogram(String str) {
//            str = str.toLowerCase();
//            Set<Character> letters = new HashSet<>();
//            
//            for(Character c : str.toCharArray())
//                letters.add(c);
//            
//            return str.length() == letters.size();
//        } 
  

}
