package errorHandling;


public class ErrorHandling {
	public static void main(String[] args) {
		int calculate = ErrorHandling.divisor(8, 0);
		System.out.println(calculate);
	}
	 public static int divisor(int number, int divisor){
		 try { 										
			 return number/divisor; //Wir versuchen die Division im try Block, da wir wissen das sie auch einen Fehler werfen kann. 
		 }catch (ArithmeticException ariException) { //Der Fehler der Division wird gefangen und behandelt. (ArithmeticException ariException) = Argumenttyp und Name wie bei z.B.(int divisor)
			 throw new IllegalArgumentException("Teilen durch 0 ist nicht erlaubt!"); //Werfen wir einen neuen Fehler mit einen Text. Um einen eigenen Text als Fehlermeldung zurück zu geben.
			 //Wenn eine Funktion etwas zurückgeben soll, muss wie z.B. hier ein int zurück gegeben werden oder wie hier mit throw einen Fehler.
		 }
	 }
}
