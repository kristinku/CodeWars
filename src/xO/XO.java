/*
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. 
 * The string can contain any char.
 * Examples input/output:
 * XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
 */

package xO;

public class XO {
	public static void main(String[] args) {
		String input = "xXoo";
		boolean endresult = XO.getXO(input);
		System.out.println(endresult);

	}

	public static boolean getXO(String str) {
		int anzahlX = 0;
		int anzahlO = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'x') {
				anzahlX++;
			} else if (str.toLowerCase().charAt(i) == 'o') {
				anzahlO++;
			}
		}
		return anzahlX == anzahlO ? true : false; //schnelle IF else: return Bedingung ?(Bedingung erfüllt) : (:= else, Bedingung nicht erfüllt)
	} 
}
