//Write a function get_char() / getChar() which takes a number and returns the corresponding ASCII char for that value.


package ascii;

public class Ascii {
	public static void main(String[] args) {
		int number = 65;
		char endresult = Ascii.getChar(number);
		System.out.println(endresult);
		
	}
	
	  public static char getChar(int c) {
		  //Der Ergenbis Typ einer Funktion ist der Typ der Ergebnisvariable. 
		  //Hier im Beispiel: Ich möchte einen int in char umwandeln. Deswegen beginnt meine Variable mit char.
		  //(typ) heißt cast. D.H. der Wert hinter der Klammer wird in den Typ innerhalb der Klammer umgewandelt.
		   char charvalue = (char) c;
	        return charvalue; 
		  }
}
