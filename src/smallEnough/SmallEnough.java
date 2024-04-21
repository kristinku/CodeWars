//You will be given an array and a limit value. You must check that all values in the array are below or equal 
//to the limit value. If they are, return true. Else, return false.
//You can assume all values in the array are numbers.

package smallEnough;

public class SmallEnough {
	public static void main(String[] args) {
		int[] numbers = {  101, 45, 75, 105, 99, 105, 107 };
		boolean check = SmallEnough.smallEnough(numbers, 107);
		System.out.println(check);
	}

	public static boolean smallEnough(int[] a, int limit) {
		for (int number : a) {	
			if(number > limit) {
				   return false; 	
			   }
		}
		return true;
	}
}


