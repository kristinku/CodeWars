//Aufgabe Kata Return mit Scanner erstellt, da Aufgabe falsch verstanden. Scanner Funktion funktioniert aber gut.

package kataReturn;

import java.util.Scanner;

public class KataReturnScanner {
	public static void main(String[] args) {
		String endresult = KataReturnScanner.greet();
		System.out.println(endresult);
		
	}
	  public static String greet() {
		  Scanner sc = new Scanner(System.in);
		  String eingabe = sc.next();
		  
	  return "Hello, " + eingabe + " how are you doing today?";
	}

}
