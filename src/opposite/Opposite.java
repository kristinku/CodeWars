//Given an integer or a floating-point number, find its opposite. 14 -> -14
package opposite;

public class Opposite {
	public static void main(String[] args) {
		int startNumber = 15;
		int oppositeNumber = Opposite.opposite(startNumber);
		System.out.println(oppositeNumber);
	}
		
    public static int opposite(int number) {
    	return number * -1;
    }
}
