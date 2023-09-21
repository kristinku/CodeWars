package welcome;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
	public static void main(String [] args) {
		String welcomeGreet = Welcome.greet("french");
		System.out.println(welcomeGreet);
	}
	
	   public static String greet(String language){
		   Map<String, String> greetAllLanguage = new HashMap<String, String>();
		   greetAllLanguage.put("english", "Welcome");
		   greetAllLanguage.put("czech", "Vitejte");
		   greetAllLanguage.put("danish", "Velkomst");
		   greetAllLanguage.put("dutch", "Welkom");
		   greetAllLanguage.put("estonian", "Tere tulemast");
		   greetAllLanguage.put("finnish", "Tervetuloa");
		   greetAllLanguage.put("flemish", "Welgekomen");
		   greetAllLanguage.put("french", "Bienvenue");
		   greetAllLanguage.put("german", "Willkommen");
		   greetAllLanguage.put("irish", "Failte");
		   greetAllLanguage.put("italian", "Benvenuto");
		   greetAllLanguage.put("latvian", "Gaidits");
		   greetAllLanguage.put("lithuanian", "Laukiamas");
		   greetAllLanguage.put("polish", "Witamy");
		   greetAllLanguage.put("spanish", "Bienvenido");
		   greetAllLanguage.put("swedish", "Valkommen");
		   greetAllLanguage.put("welsh", "Croeso");
		   String result = greetAllLanguage.get(language);
		   return result == null ? "Welcome" : result;
		   
		   }
}


