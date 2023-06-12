//Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
//For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
// and month 11 (November), is part of the fourth quarter.

package quarterOf;

import java.util.Arrays;
import java.util.List;

public class QuarterOf {
	public static void main(String[] args) {
		int endresult = QuarterOf.quarterOf(12);
		System.out.println(endresult);
		
	}
	public static int quarterOf(int month) {
		 List<Integer> quarter1 = Arrays.asList(1,2,3); 
		 List<Integer> quarter2 = Arrays.asList(4,5,6); 
		 List<Integer> quarter3 = Arrays.asList(7,8,9); 
		 List<Integer> quarter4 = Arrays.asList(10,11,12); 
	     if (quarter1.contains(month)) {
	    	 return 1;
	     }
	     if (quarter2.contains(month)) {
	    	 return 2;
	     }	  
	     if (quarter3.contains(month)) {
	    	 return 3;
	     }	 
	     if (quarter4.contains(month)) {
	    	 return 4;
	     }
	     throw new IllegalArgumentException("Month only allowed between 1-12");
	}
}
