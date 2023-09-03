//Lösung: Wir gehen zuerst über das Alphabet und schauen ob jeder Buchstabe vom Alphabet in unseren String vorhanden ist. 

package pangramChecker;


public class PangramChecker {
	public static void main(String[] args) {
		PangramChecker objectPangram = new PangramChecker();//Da Funktion nicht static ist muss ein Objekt für den Funktionsaufruf von der Klasse erstellt werden.
		boolean pangramCheck = objectPangram.check("The quick brown fox jumps over the lazy dog");
		System.out.println(pangramCheck);
	}
	
	  public boolean check(String sentence){
		  String newSentence = sentence.toUpperCase();
		  boolean allExisting = true;
		  for(int i = 65; i <= 90; i++) { //Prüft Acsi Tabelle von 65-90 (A-Z), um das Alphabet von a beginnend zu prüfen ob der Buchstabe im Satz vorhanden ist.
			  if(newSentence.indexOf(i) == -1) { //Prüft Position von einen Buchstaben im String, gibt -1 zurück wenn Buchstabe im String nicht vorhanden ist
				  allExisting = false;
				  break;
			  }
			  
		  }
			  
		    return allExisting;
		  }
	  
}
