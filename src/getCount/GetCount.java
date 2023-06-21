/*Return the number (count) of vowels in the given string.
 *We will consider a, e, i, o, u as vowels for this Kata (but not y).
 *The input string will only consist of lower case letters and/or spaces
 */
package getCount;

import java.util.List;

public class GetCount {
	public static void main(String[] args) {
		String word = "Andreas";
		int endresult = GetCount.getCount(word);
		System.out.println(endresult);
		
		
	}
	  public static int getCount(String str) {
		  int sum = 0;
		 List<String> vowels = List.of("a", "e", "i", "o", "u");
		  for(int i = 0; i < str.length(); i++) {
			  if(vowels.contains(String. valueOf(str.toLowerCase().charAt(i)))) { 
				  sum = sum + 1;
			  } 
		  }
		    return sum;
		  }
}
