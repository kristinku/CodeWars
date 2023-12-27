//https://www.codewars.com/kata/56fc55cd1f5a93d68a001d4e/train/java

package stairs;

public class Stairs {
	public static void main(String[] args) {
		int[] sunday = {6737, 7244};
		int[] monday = {5842, 5484};
		int[] tuesday = {7148, 6152};
		int[] wednesday = {50, 102};
		int[] thursday = {456, 788};
		int[] friday = {500, 600};
		int[] saturday = {9247, 8274};
		int[][] steps = {sunday,monday,tuesday,wednesday,thursday,friday,saturday};
		long steps20YearsLater = Stairs.stairsIn20(steps);
		System.out.println(steps20YearsLater);
		}
		
    public static long stairsIn20(int[][] stairs)  {
    	long sum = 0;
    	for(int[] day : stairs) {
    		for(int stepsPerDay : day) {
    			sum = sum + stepsPerDay;
    		}
    	}
    	return sum * 20;
    }
}
	

