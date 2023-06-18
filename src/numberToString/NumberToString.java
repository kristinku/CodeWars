//Convert a Number to a String! We need a function that can transform a number (integer) into a string.
//What ways of achieving this do you know?
//
package numberToString;

public class NumberToString {
	public static void main(String[] args) {
		int number = 123;
		String endresult = NumberToString.numberToString(number);
		System.out.println(endresult);
	}
	
	  public static String numberToString(int num) {
		  String value = String.valueOf(num);
		  return value; 
	  }
}
