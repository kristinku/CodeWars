//Lassen Sie sich die Zahlen von 0 bis 55 untereinander ausgeben. Danach kommt die Nachricht “Fertig!”.

package whileHochzählen;

public class WhileHochzählen {
	public static void main(String[] args) {
		int zahl = 0;
		while (zahl < 56) {
			System.out.println(zahl);
			zahl++;
		}
		System.out.println("Fertig!");
	}
}
