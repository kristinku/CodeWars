//Task:
//Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep..."
// Input will always be valid,i.e. no negative integers.

package countSheep;

public class CountSheep {
	public static void main(String[] args) {
		int number = 3; 
		String endresult = CountSheep.countSheep(number); 
		System.out.println(endresult);
	}
	
	public static String countSheep(int counter) {
		String ergebnis = "";
		for(int i=1; i<=counter; i++) {
			  ergebnis = (ergebnis + i + " sheep...");
			}
		return ergebnis;
	}
}
