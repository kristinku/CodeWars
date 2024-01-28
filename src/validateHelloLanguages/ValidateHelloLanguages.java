package validateHelloLanguages;

public class ValidateHelloLanguages {
	public static void main(String[] args) {
		boolean language = ValidateHelloLanguages.validateHello("hombre! Hola!");
		System.out.println(language);
	
	}

	public static boolean validateHello(String greetings) {
		String newGreetings = greetings.toLowerCase();
		if (newGreetings.contains("hello") || newGreetings.contains("ciao") || newGreetings.contains("salut")
				|| newGreetings.contains("hallo") || newGreetings.contains("hola") || newGreetings.contains("ahoj")
				|| newGreetings.contains("czesc")) {
			return true;
			} else return false; 
		} 
	}  

//Lösung mit Regex aus Codewars: 
//return greetings.matches("(?i).*(hello|ciao|salut|hallo|hola|ahoj|czesc).*");

		  
