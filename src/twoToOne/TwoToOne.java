//Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, 
//the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

package twoToOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class TwoToOne {
	public static void main(String[] args) {
		String twoToOneLongestString = TwoToOne.longest("xyaabbbccccdefww", "kkkkkaaaaiiiii");
		System.out.println(twoToOneLongestString);
		
	}
		public static String longest(String s1, String s2) {
			String s1u2= s1 + s2;
		    String[] arrS1u2 = s1u2.split(""); //Hier wird aus String ein String[]
			Set<String> longestString = new HashSet<>(); // Set beinhaltet Werte nur einmal.
			for(int i = 0; i < arrS1u2.length; i++) {
				longestString.add(arrS1u2[i]);
				
			}
			ArrayList<String> arrayList = new ArrayList<String>(longestString); //um einen Set zu sortieren haben wir eine Array List daraus erstellt
			Collections.sort(arrayList); // sortieren
			return String.join("", arrayList); // Komma aus String 
		}
}
