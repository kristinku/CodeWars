// It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. 
// You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

package removeChars;


public class RemoveChars {
	public static void main(String[] args) {
		String newString = RemoveChars.remove("Baum");
		System.out.println(newString);
	}
	
	  public static String remove(String str) {
		  str = str.substring(1, str.length() - 1); 
		  
		        
	      
		  //char[] characters = str.toCharArray();
		  //char first = str.charAt(0);
		  //char last = str.charAt(str.length() - 1);
	  
	  	//List<Character> chars = new ArrayList<>();
	  	//for (char ch : str.toCharArray()) { laut internet soll leere Liste gefüllt werden
	  	//  chars.add(ch); Warum so? wieso kann ich nicht einfach str eintragen?
		  
		  return str;

	    }
}
