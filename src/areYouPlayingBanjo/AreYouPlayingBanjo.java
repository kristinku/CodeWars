//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
//The function takes a name as its only argument, and returns one of the following string
//name + " plays banjo" 
//name + " does not play banjo"
//Names given are always valid strings.

package areYouPlayingBanjo;

public class AreYouPlayingBanjo {
	public static void main(String[] args) {
		String n = AreYouPlayingBanjo.areYouPlayingBanjo("Andi");
		System.out.println(n);
	}

	public static String areYouPlayingBanjo(String name) {
		if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
			return name + " plays banjo";
		} else
			return name + " does not play banjo"; 
		}
	}
