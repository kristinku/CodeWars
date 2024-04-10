//Simple, given a string of words, return the length of the shortest word(s).
//String will never be empty and you do not need to account for different data types.


package shortestWord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortestWord {
	public static void main(String[] args) {
		int shortLength = ShortestWord.findShort("Let's travel abroad shall we");
		System.out.println(shortLength);
		
	}
    public static int findShort(String s) {
    	String[] sArray = s.split(" ");
    	List<Integer> myList = new ArrayList<Integer>();
    	for(String sA : sArray) {
    		myList.add(sA.length());
    	} 
        Collections.sort(myList);
        return myList.get(0);
    }
}
