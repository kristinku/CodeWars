package find_the_odd_int;

public class FindOdd {

	public static void main(String[] args) {
		int[] zahlenliste = {20, 20, 33, 5, 5};
		int ergebnis = FindOdd.findIt(zahlenliste);
		System.out.println(ergebnis); 
		
	}

	public static int findIt(int[] a) {
		// Variable für Schleife vorbereiten
		int vorkommen = 0;
		//Schleife um untersuchteZahl fest zu legen und weiter auf nächste Zahl zu springen
		for (int index = 0; index < a.length; index++) {
			// Die zu untersuchende Zahl wird festgelegt
			int untersuchteZahl = a[index];
			// Schleife mit Bestimmung der Listenlänge (a = Liste)
			for (int i = 0; i < a.length; i++) {
				// Variable für Wert in Liste an der Stelle des index
				int zwischenspeicher = a[i];
				// WEnn dann Funktion. Wenn zwischenspeicher gleich untersuchterZahl ist, zähle vorkommen hoch
				if (zwischenspeicher == untersuchteZahl) {
					vorkommen++;
				}
			}
			// Wenn dann Funktion. Wenn das vorkommen ungerade ist, dann gib untersuchteZahl zurück
			if (vorkommen % 2 == 1) {
				return untersuchteZahl;
			}
		}
		
		// Keine ungerade Zahl gefunden. Werfe einen Fehler.
		throw new IllegalArgumentException();	
	  }
}
