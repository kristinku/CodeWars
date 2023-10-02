//https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java
package sumOfASequence;

public class SumOfASequence {
	public static void main(String[] args) {
		int sum = SumOfASequence.sequenceSum(2, 5, 2);
		System.out.println(sum);
	}
	
	  public static int sequenceSum(int start, int end, int step) {
		   if(start > end) {
			   return 0;
		   }
		   int sum = 0;
		   for(int i = start; i <= end; i+=step) {
			   sum += i; // sum = sum + i;
		   }
		    return sum;
		  }

}
