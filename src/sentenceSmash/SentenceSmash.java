//Write a function that takes an array of words and smashes them together 
//into a sentence and returns the sentence. You can ignore any need to sanitize 
//words or add punctuation, but you should add spaces between each word. Be careful, 
//there shouldn't be a space at the beginning or the end of the sentence!

package sentenceSmash;

public class SentenceSmash {
	public static void main(String[] args) {
		String[] words = {"Hello", "how", "are", "you"};
		String sentence = SentenceSmash.smash(words);
		System.out.println(sentence);
	}
	public static String smash(String... words) {
		String newWords = "";
		for(String w : words) {
			newWords = newWords + w + " ";
		}
		return newWords.trim();
	}
	
//	public static String smash(String... words) {
//	    return String.join(" ", words);
//	  }
}
