//https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
package dinglemouse;

import java.util.Arrays;

public class Dinglemouse {
	public static void main(String[] args) {
		int humanYears = 3;
		int[]endresult = Dinglemouse.humanYearsCatYearsDogYears(humanYears);
		System.out.println(Arrays.toString(endresult));
	}
	
	  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
		  int catYears = 0;
		  if(humanYears >= 1) {
			  catYears = 15;
		  } if(humanYears >= 2) { 
			  catYears = catYears + 9;
		  } if(humanYears >= 3) {
			  catYears = catYears +4 *(humanYears-2); 
		  }
		  int dogYears = 0;
		  if(humanYears >= 1) {
			  dogYears = 15;
		  } if(humanYears >= 2) { 
			  dogYears = dogYears + 9;
		  } if(humanYears >= 3) {
			  dogYears = dogYears +5 *(humanYears-2); 
		  }
		  
		    return new int[]{humanYears,catYears,dogYears};
		  }
	  }
