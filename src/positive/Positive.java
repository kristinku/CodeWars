//You get an array of numbers, return the sum of all of the positives ones.
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//Note: if there is nothing to sum, the sum is default to 0.

package positive;

public class Positive {
	public static void main(String[] args) {
		int[] variety = {1, -4, 7, 12};
		int endresult = Positive.sum(variety);
		System.out.println(endresult);
		
	}
	 public static int sum(int[] arr){
		 int total = 0;
		 for (int i = 0; i < arr.length; i++) {
			 if(arr[i] > 0) {
				 total = total + (arr[i]); 
			 }	 
		 }	
		 	return total;
	}
}
