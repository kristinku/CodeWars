//Your task is to write a function that takes a string and return a new string with all vowels removed.
//For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//Note: for this kata y isn't considered a vowel.

package attackingTrolls;

public class AttackingTrolls {
	public static void main(String[] args) {
		String resultAttacking = AttackingTrolls.disemvowel("This website ist for losers LOL!");
		System.out.println(resultAttacking);
	}

	public static String disemvowel(String str) { 
    	for(String letter : str.split("")) {
    		String lowerletter = letter.toLowerCase();
    		if(lowerletter.equals("a") || lowerletter.equals("e") || lowerletter.equals("i")  || lowerletter.equals("o") || lowerletter.equals("u")) {
    			str = str.replaceAll(letter, ""); 			
    		}	
    	}
    	return str;
    	   
    }

}
