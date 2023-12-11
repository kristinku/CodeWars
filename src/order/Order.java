//https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

package order;

import java.util.Arrays;

public class Order {
	public static void main(String[] args) {
		String orderedString = Order.order("is3 M1y nam2e 4Karin");
		System.out.println(orderedString);
	}
	  public static String order(String words) {
		    if(words == "") return "";
		    String[] wordsChar = words.split(" ");
		    String[] newOrderWords = new String[wordsChar.length];
		    for(int i = 0; i < wordsChar.length; i++) {
		    	int geszahl = i+1;
		    	newOrderWords[i] = Order.findWord(geszahl, wordsChar);
		    }
		    return String.join(" ", newOrderWords); //join ist der gegenspieler zu split
		  }
	  
	  private static String findWord(int gesZahl, String[] array) {
		  for(String word : array) {
			  if(word.contains(gesZahl+"")) { // int+"" wandelt ein int schnell in String um
				  return word;
			  }
		  }
		  throw new IllegalArgumentException("Number not found");
	  }

}
