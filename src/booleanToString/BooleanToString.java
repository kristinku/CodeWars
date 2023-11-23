package booleanToString;

public class BooleanToString {
	public static void main(String[] args) {
		String endresult = BooleanToString.convert(true);
		System.out.println(endresult);
	}
	
	  public static String convert(boolean b) {
		  String bo = String.valueOf(b); //parse ist ähnlich wie cast. Aber es versucht zu interpretieren, statt hart einen Wert in einen anderen Typ zu pressen.
		    return bo;
	}
}
