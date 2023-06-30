package interaktion;

import java.awt.Toolkit;

public class Interaktion {
	public static void main(String[] args) {
		Toolkit.getDefaultToolkit().beep();
		boolean endresult = Interaktion.authenticate(args);
		if(endresult == true) {
			System.out.println("Willkommen");
		} else {
			 System.out.println("Verschwinde du Schuft!");
		}
		
	}
	  public static boolean authenticate(String[] credentials) {
		  boolean availableUsername = false;
		  boolean availablePassword = false; 
		  for(int i=0; i<credentials.length; i++) {
			  if(credentials[i].startsWith("Username")) {
				  availableUsername = true; 
				  String[] split = credentials[i].split("=");
				  boolean isCorrect = split[1].equals("Kristin");
				  if(isCorrect == false) {
					  return false;
				  }
			  }
			  if(credentials[i].startsWith("Password")) {
				  availablePassword = true;
				  String[] split = credentials[i].split("=");
				  boolean isCorrect = split[1].equals("Schatz");
				  if(isCorrect == false) {
					  return false;
				  }
			  }
		  }
		  return availableUsername && availablePassword;
	  }

	
}
