//When provided with a letter, return its position in the alphabet.
package findThePosition;

public class FindThePosition {
	public static void main(String[] args) {
		String endresult = FindThePosition.position('z');
		System.out.println(endresult);

	}
	public static String position(char alphabet) {
		char[] bigAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int position = 0;
		for (int i = 0; i < bigAlphabet.length; i++) {
			if (bigAlphabet[i] == alphabet) {
				position = i+1;
			}
		}
		return "Position of alphabet: " + position;
	}
}
//ABC Lösungen von anderen aus Codewars mit ASCII und cast:
//  public static String position(char alphabet) {
//  return "Position of alphabet: " + ((int) alphabet - 96);

//ABC Lösung von anderen aus Codewarse mit String und indexOf: 
//public static String position(char alphabet){
//String s = "abcdefghijklmnopqrstuvwxyz";
//int n = s.indexOf(alphabet)+1;
//return "Position of alphabet: " + n;


//ABC Codewars Lösung: 
// Bsp: (b - 96(a) +1) = 2 hier erkennt der Computer das b laut Ascii 97 ist und a 96.
//return "Position of alphabet: " + (alphabet-'a'+1);
//ähnlich:
//return "Position of alphabet: " + (alphabet-96);
 