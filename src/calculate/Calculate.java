/*
 * Write function bmi that calculates body mass index (bmi = weight / height2).
 * if bmi <= 18.5 return "Underweight"
 * if bmi <= 25.0 return "Normal"
 * if bmi <= 30.0 return "Overweight"
 * if bmi > 30 return "Obese"
*/

package calculate;

public class Calculate {
	public static void main(String[] args) {
		double weight = 120;
		double height = 1.92;
		String bmiResult = Calculate.bmi(weight, height);
		System.out.println(bmiResult);
	}
	 public static String bmi(double weight, double height) {
		 double bmiCalculation = weight / Math.pow(height, 2);
		 if(bmiCalculation <= 18.5) {
			 return "Underweight";
		 } else if (bmiCalculation <= 25.0) {
			 return "Normal";
		 } else if (bmiCalculation <= 30.0) {
			 return "Overweight";
		 }
		    return "Obese";
		 }
}
