package stringToNumber;

public class StringToNumber {

	public static void main(String[] args) {
		int zahl = StringToNumber.stringToNumber("50");
		System.out.println(zahl);
	}
	  public static int stringToNumber(String str) {
		    //TODO: Convert str into a number
		  int numberInt = Integer.parseInt(str);
		  return numberInt;
	  }
}

