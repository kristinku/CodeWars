//Given a non-empty array of integers, return the result of multiplying the values together 
//in order. Example: [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24


package reduceButGrow;

public class ReduceButGrow {
public static void main(String[] args) {
	int[] numbers = {1, 2 , 3, 4}; 
	int growResult = ReduceButGrow.grow(numbers);
	System.out.println(growResult);
}
	
	public static int grow(int[] x) {
		int sum = 1;
		for(int number : x) {
			sum = sum * number; 
				
	  }
		  return sum;
	}
}

