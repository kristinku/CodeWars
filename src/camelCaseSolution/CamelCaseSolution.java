package camelCaseSolution;

public class CamelCaseSolution {
	public static void main(String[] args) {
		String result = CamelCaseSolution.camelCase("camelCasingTest");
		System.out.println(result);

	}

	public static String camelCase(String input) {
		for (int i = 0; i < input.length(); i++) {
			boolean check = CamelCaseSolution.isUpperCase(input.charAt(i));
			if (check == true) {
				String before = input.substring(0, i);
				String after = input.substring(i);
				input = before + " " + after;
				i++;
			}
		}
		return input;
	}
// Wir erstellen eine extra Funktion die von unserer Hauptfunktion aufgerufen wird. Dadurch wird der Code besser strukturiert. 
// Die Logik bekommt durch den Funktionsnamen automatisch eine Art Dokumentation.
	
	public static boolean isUpperCase(char input) {
		return input >= 65 && input <= 90;
//		
// Wenn boolean zurück gegeben werden soll, kann bei if Abfragen einfach die Bedingung zurück gegeben werden. 
// Da das Ergebnis der Bedingung ja bereits true oder false ist.
// 		Langer Lösungsweg:
//		  if(input >= 65 && input <= 90) {
//			  return true;
//		  } else {
//			  return false;
//		  }
	}
}
