//https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/train/java

package evaporator;

public class Evaporator {
	public static void main(String[] args) {
		int dayOutOfUse = Evaporator.evaporator(10, 10, 5);
		System.out.println(dayOutOfUse);
	}
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
			int days = 0;
			double minThreshold = content / 100 * threshold;
			for(int i = 1; content >= minThreshold; i++) {
				content = content / 100*(100 - evap_per_day);
				days = i; 
			}
			return days;
		}
}
