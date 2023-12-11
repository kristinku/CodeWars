package weihnachstwichteln;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Weihnachstwichteln {
	public static void main(String[] args) {
		List<String> wichtelpartner = Arrays.asList("Kristin", "Leon", "Amelie", "Elisa", "Elke", "Joachim");
		Weihnachstwichteln.wichtel(wichtelpartner);
	}
	
	public static void wichtel(List<String> wichtelpartner) {
		Collections.shuffle(wichtelpartner); // Durcheinanderbringen der Liste
		for(int i = 0; i < wichtelpartner.size(); i++) { // Gehen wir mit einer Schleife über unsere Wichtelpartner
			String partner = wichtelpartner.size() == i+1 ? wichtelpartner.get(0) : wichtelpartner.get(i+1); //If Funktion um den nächsten Partner zu finden. Wenn letzter Partner dann erster Partner
			Weihnachstwichteln.sendMail(wichtelpartner.get(i), partner); // Funktionsaufruf um E-Mail zu versenden
		}	
	}
	
	private static void sendMail(String empfaenger, String partner) { // Nur Test
		System.out.println(empfaenger + " hat " + partner + " als Partner");
	}
	

}
