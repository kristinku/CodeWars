package highestScoringWord;

public class HighestScoringWord {
	public static void main(String[] args) {
		String highestWord = HighestScoringWord.high("b aa");
		System.out.println(highestWord);
	}
	
	  public static String high(String s) {
		  int highestValue = 0;
		  String highestWord = "";
		  String[] splittedString = s.split(" ");
		  for(String word : splittedString) {
			  if(HighestScoringWord.valueOfWord(word) > highestValue) {
				  highestValue = HighestScoringWord.valueOfWord(word);
				  highestWord = word;

			  }
		  }
		  return highestWord;
	  }
	  
	  private static int valueOfWord(String word) {
		  int value = 0;
		  char[] letters = word.toCharArray();
		  for(char l : letters) {
			  value += l - 96;
		  }
		  return value;
	  }	   
}
