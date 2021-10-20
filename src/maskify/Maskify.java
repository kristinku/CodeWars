package maskify;

public class Maskify {
	
	public static void main(String[] args) {
		String text1 = Maskify.maskify("22");
		System.out.println(text1);	
	}

	public static String maskify(String text) {
		//Text als Liste
		char[] liste = text.toCharArray();
		//Länge der Liste eintragen
		int listenlänge = liste.length; 
		//Alle Zeichen bis auf die vier letzten sollen aus# werden
		for (int i = 0; i < listenlänge -4; i++){
			liste[i] = '#'; 
			
		}
		//Liste wieder als Text
		String newString = String.valueOf(liste);
		return newString; 
	
		
	}

}
