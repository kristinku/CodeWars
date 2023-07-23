/*
 * Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. 
 * If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
 * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */

package oppositesAttract;

public class OppositesAttract {
	public static void main(String[] args) {
		int flower1 = 2;
		int flower2 = 5;
		boolean itIsLove = OppositesAttract.isLove(flower1, flower2);
		System.out.println(itIsLove);

	}

	public static boolean isLove(final int flower1, final int flower2) {
		if (flower1 == flower2) {
			return false;
		} else if (flower1 % 2 == 0 && flower2 % 2 != 0) { // != heißt es darf nicht 0 sein.
			return true;
		} else if (flower2 % 2 == 0 && flower1 % 2 != 0) {
			return true;
		}
		throw new IllegalArgumentException(); // muss Fehler werfen, ansonsten weiß der Computer nicht ob alle Fälle mit den IFs abgefanden ist. 
	}
	
//Lösung: mit Andi ohne zweites else if: 
		public static boolean isLove2(final int flower1, final int flower2) {
			if (flower1 == flower2) {
				return false;
			} else if (flower1 % 2 + flower2 % 2 == 1) { // Modulo von flower1 und 2 muss 1 ergeben sonst ist es false
				return true;
		
			}
			throw new IllegalArgumentException();
	}
//Lösung: von Andi 
		public static boolean isLove3(final int flower1, final int flower2) {
			return flower1 % 2 != flower2 %2; // mit != sagt man hier das flower1 nicht gleich flower2 sein darf
	}
	
}

