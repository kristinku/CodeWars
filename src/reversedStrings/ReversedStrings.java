package reversedStrings;

public class ReversedStrings {
	public static void main(String[] args) {
		String reversedString = ReversedStrings.solution("word");
		System.out.println(reversedString);
	}
	
	  public static String solution(String str) {
		   String reverse = new StringBuilder(str).reverse().toString();
		    return reverse;
		  }
}
