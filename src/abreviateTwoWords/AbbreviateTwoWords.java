//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.
//It should look like this:Sam Harris => S.H

package abreviateTwoWords;


public class AbbreviateTwoWords {
	public static void main(String[] args) {
		String gesamtName = "Max mustermann";
		String ergebnis = AbbreviateTwoWords.abbrevName(gesamtName);
		System.out.println(ergebnis);
	}

	public static String abbrevName(String name) {
		String upperCase = name.toUpperCase();
		String[] parts = upperCase.split(" ");
		String firstName = parts[0];
		String lastName = parts[1];
		
		String initial1 = firstName.substring(0, 1);
		String initial2 = lastName.substring(0, 1);
		
		return initial1 + "." + initial2;
	}
	
}
