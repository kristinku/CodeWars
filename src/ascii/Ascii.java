//Write a function get_char() / getChar() which takes a number and returns the corresponding ASCII char for that value.


package ascii;

public class Ascii {
	public static void main(String[] args) {
		int number = 65;
		char endresult = Ascii.getChar(number);
		System.out.println(endresult);
		
	}
	
	  public static char getChar(int c) {
		   char charvalue = (char) c;
	        return charvalue; 
		  }
}
