//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//35231 => [1,3,2,5,3] / 0 => [0]

package reversedArray;

import java.util.Arrays;

public class ReversedArray {
	public static void main(String[] args) {
		long n = (1234);
		int[] sortN = ReversedArray.digitize(n);
		System.out.println(Arrays.toString(sortN)); //int[] muss in einen String umgewandelt werden um mit System.out.println ausgegeben werden.
	}
	  public static int[] digitize(long n) {
		   String number = String.valueOf(n); // von long in int[] umzuwandeln geht nicht so einfach, deswegen wandelt man zuerst in String um.
		   number = new StringBuilder(number).reverse().toString();
		   char[] numberCharArray = number.toCharArray();
		   int[] numberIntArray = new int[numberCharArray.length];
		   for(int i = 0; i < numberCharArray.length; i++) {
			   int numberInt = Character.getNumericValue( numberCharArray[i] ); // ein char (Element von Char Array[i] in int umgewandelt)
			   numberIntArray[i] = numberInt; 
		   }
		  
		  return numberIntArray; 
	  }

}
