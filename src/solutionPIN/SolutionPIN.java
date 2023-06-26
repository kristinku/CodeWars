//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//If the function is passed a valid PIN string, return true, else return false.

package solutionPIN;

public class SolutionPIN {
	public static void main(String[] args) {
		String pin = "+234";
		boolean endresult = SolutionPIN.validatePin(pin);
		System.out.println(endresult);
	}

	public static boolean validatePin(String pin) {
		if ((pin.length() == 4 || pin.length() == 6) && (!pin.contains("-") && !pin.contains("+"))) {
			try { // Wenn wir eine Exeption fangen möchten brauchen wir den try catch block.
				int result = Integer.parseInt(pin);
			} catch (NumberFormatException e) { // wir fangen die Exeption, die durch das Integer parse Int entstehen
												// !kann!
				return false; // weil wir die Exeption nicht ausgeben möchten sondern nur false.
			}
			return true;
		} else {
			return false;
		}
	}
}
