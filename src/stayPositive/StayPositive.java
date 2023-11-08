// Du erhältst eine Liste mit "yes" und "no" Strings. Schreibe eine Funktion, die eine Liste zurückgibt, die nur "Yes"e beinhaltet.
// Schreibe zwei Alternativen der Funktion: Einmal mit Stream und einmal ohne.
package stayPositive;

import java.util.ArrayList;
import java.util.List;

public class StayPositive {
	public static void main(String[] args) {
		List<String> yesAndNo = List.of("yes", "no", "yes", "no", "yes");
		List<String> filtered = StayPositive.stayPositiveOther(yesAndNo);
		System.out.println(filtered);
		
	}
	
	public static List<String> stayPositiveStream(List<String> input) {
		return input.stream().filter(i -> i != "no").toList(); //i -> (für jedes Element prüfe...) i != "no"  (also ob i nicht! no ist)

	}
	
	public static List<String> stayPositiveOther(List<String> input) {
		List<String> newInput = new ArrayList<String>(); 
		for(String yOn : input) {
			if(yOn == "yes") {
				newInput.add("yes");				
			}
		}
			return newInput;
	}
}
