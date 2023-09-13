//You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, 
//return the middle character. If the word's length is even, return the middle 2 characters.
//Example:
//Kata.getMiddle("test") should return "es"
//Kata.getMiddle("testing") should return "t"
//Kata.getMiddle("middle") should return "dd"
//Kata.getMiddle("A") should return "A"

package getMiddle;

public class GetMiddle {
	public static void main(String[] args) {
		String word = "testing";
		String middleCharacter = GetMiddle.getMiddle(word);
		System.out.println(middleCharacter);
	}

	public static String getMiddle(String word) {
		int oddOrEven = word.length() % 2;
		if (oddOrEven == 0) {
			return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
		} else {
			return word.substring(word.length()/2, word.length()/2+1);
		}
	} 
}
