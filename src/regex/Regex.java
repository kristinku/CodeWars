package regex;

public class Regex {
	public static void main(String[] args) {
		boolean matches = Regex.validateUsr("test1234_");
		System.out.println(matches);
	}
	
	  public static boolean validateUsr(String s) {
		  return s.matches("^[a-z\\d\\_]{4,16}$"); // Bei Java müssen escape \ doppelt genommen werden.
		  }										// Escape = geschützte Zeichen die eine Funktion haben z.B. $ oder ^ 
}												// d.h. die Zeichen sind bei Regex keine Zeichen mehr sondern funktionen. 
												// um die nur die Zeichen auszuwählen macht man escape \