//Determine the total number of digits in the integer (n>=0) given as input to the function. 
//For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits. Be careful to avoid overflows/underflows.
//All inputs will be valid.

package numberOfDecimalDigits;

public class NumberOfDecimalDigits {
	public static void main(String[] args) {
		int anzahlZiffern = NumberOfDecimalDigits.Digits(1254l);
		System.out.println(anzahlZiffern);
	}
	
	  public static int Digits(long n) {
		  String nString = String.valueOf(n);
		  String[] nArray = nString.split("");
		  int anzahl = 0;
		  for(int i = 1; i <= nArray.length; i++) {
			  	anzahl =+ i;
		  }
		    return anzahl;
		  }
}
