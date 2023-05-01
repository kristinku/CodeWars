//You were camping with your friends far away from home, 
//but when it's time to go back, you realize that your fuel is running 
//out and the nearest pump is 50 miles away! You know that on average, 
//your car runs on about 25 miles per gallon. There are 2 gallons left.
//Considering these factors, write a function that tells you if it is possible to get to the pump or not.
//Function should return true if it is possible and false if not.
//

package willYouMakeIt;

public class WillYouMakeIt {

	public static void main(String[] args) {
		double distance = 50;
		double milesPerGallon = 25;
		double fuel = 2;
		boolean ergebnis = WillYouMakeIt.zeroFuel(distance, milesPerGallon, fuel);
		System.out.println(ergebnis);
	}

	public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
		double possibleMiles = fuelLeft * mpg;
		if (possibleMiles >= distanceToPump) {
			return true;
		} else {
			return false;
		}
	}
}
