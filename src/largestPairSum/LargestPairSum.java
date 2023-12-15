//Given a sequence of numbers, find the largest pair sum in the sequence.
//Example: [10, 14, 2, 23, 19] -->  42 (= 23 + 19)

package largestPairSum;

import java.util.Arrays;

public class LargestPairSum {
	public static void main(String[] args) {
		int[] n = {20, 7, 5, 50};
		int sum = LargestPairSum.largestPairSum(n);
		System.out.println(sum);
	}
	
    public static int largestPairSum(int[] numbers){
    	Arrays.sort(numbers);
        int sumOfTwoLargestNumbers = (numbers[numbers.length-2])+(numbers[numbers.length-1]);     
        return sumOfTwoLargestNumbers;
    }
}
