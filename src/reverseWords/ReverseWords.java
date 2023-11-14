package reverseWords;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
	public static void main(String[] args) {
		String reverseString = ReverseWords.reverseWords("        ");
		System.out.println(reverseString);
	}
	
	  public static String reverseWords(final String original){
		  if(original.replaceAll(" ", "").length() == 0) {
			  return original;
		  }
		  List<String> listOfWords = List.of(original.split(" "));
		  String result = "";
		  for(String word : listOfWords) {
			  List<String> listOfLetters = List.of(word.split(""));
			  List<String> reverseWord = new ArrayList<>();
			  for (int i = listOfLetters.size() -1; i >= 0; i--) {
				  reverseWord.add(listOfLetters.get(i)); 
			  }
			  result = result + " " + String.join("", reverseWord);
		  }
		  
		  return result.trim(); //Trim macht hinten und vorne Leerzeichen weg
	  }
}
