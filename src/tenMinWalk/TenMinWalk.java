/*
 * You live in the city of Cartesia where all roads are laid out in a perfect grid. 
 * You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. 
 * The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends 
 * you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only 
 * a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create 
 * a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be 
 * early or late!) and will, of course, return you to your starting point. Return false otherwise.
 * Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). 
 * It will never give you an empty array (that's not a walk, that's standing still!).
 */

package tenMinWalk;

public class TenMinWalk {
	public static void main(String[] args) {
		char[] wegBeschreibung = { 'n','s','n','s','n','s','n','s','n','s' };
		boolean endergebnis = TenMinWalk.isValid(wegBeschreibung);
		System.out.println(endergebnis);

	}

	public static boolean isValid(char[] walk) {
		   if(walk.length < 10 || walk.length > 10) {
			   return false;
		 }
		   int vertikalNS = 0;
		   int horizontalWO = 0;
		   for(int i = 0; i < walk.length; i++) {
			   if(walk[i] == 'w') horizontalWO = horizontalWO +1; //Kurzform von IF ohne geschleifte Klammern
			   if(walk[i] == 'o') horizontalWO = horizontalWO -1; //Lange Form von hochzählen
			   if(walk[i] == 'n') vertikalNS++; //Kurzform von hochzählen
			   if(walk[i] == 's') vertikalNS--;
		   }
		   if(horizontalWO == 0 && vertikalNS == 0) {
			   return true;
		   } else {
			   return false; 
		   }
	}
}
