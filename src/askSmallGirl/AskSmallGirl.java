package askSmallGirl;

import java.util.Arrays;

public class AskSmallGirl {
	public static void main(String[] args) {
		int ageOfGirl = AskSmallGirl.howOld("5 years old");
		System.out.println(ageOfGirl);
	}
	
	  public static int howOld(final String herOld) {
		  String[] hO = herOld.split(" "); //Hier wird aus String ein String[]
		  String year = "";
		  for(String h : hO) {
			  if(Arrays.asList("0","1","2","3","4","5","6","7","8","9").contains(h)) { //wenn die Liste(z.B.0123) beinhaltet h 
				  year = h;
			  }
		  }
		  return Integer.parseInt(year);
	  }
	  
	  public static int howOldAscii(final String herOld) {
		  return herOld.charAt(0) - 48;
	  }
		  
}
