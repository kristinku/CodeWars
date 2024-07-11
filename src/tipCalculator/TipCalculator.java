//Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.
//You need to consider the following ratings:
//    Terrible: tip 0%
//    Poor: tip 5%
//    Good: tip 10%
//    Great: tip 15%
//    Excellent: tip 20%
//The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:
//    null in Java
//Because you're a nice person, you always round up the tip, regardless of the service.

package tipCalculator;

import java.util.HashMap;

public class TipCalculator {
	public static void main(String[] args) {
		Integer tip = TipCalculator.calculateTip(30, "poor");
		System.out.println(tip);
	}

	public static Integer calculateTip(double amount, String rating) {
		rating = rating.toLowerCase();
		HashMap<String, Double> calculateTip = new HashMap<String, Double>();
		calculateTip.put( "terrible", 0d ); 
		calculateTip.put( "poor", 5d ); 
		calculateTip.put( "good", 10d ); 
		calculateTip.put( "great", 15d ); 
		calculateTip.put( "excellent", 20d ); 

		if (calculateTip.containsKey(rating)) {
			double tip = amount/100*calculateTip.get(rating);
			return (int)Math.ceil(tip);
		}
		return null;
	}
}
