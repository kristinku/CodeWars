//Write a function to split a string and convert it into an array of words.

package stringToArray;

import java.util.Arrays;

public class StringToArray {
	public static void main(String[] args) {
		String sentence = "I love arrays they are my favorit";
		String[] splittedSentence = StringToArray.stringToArray(sentence);
		System.out.println(Arrays.toString(splittedSentence));
	}
	
    public static String[] stringToArray(String s) {
    	return s.split(" ");
      }
}
