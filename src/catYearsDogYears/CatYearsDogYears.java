//https://www.codewars.com/kata/5a6d3bd238f80014a2000187/train/java

package catYearsDogYears;

import java.util.Arrays;

public class CatYearsDogYears {
	public static void main(String[] args) {
		int[] yearsOfCatandDog = CatYearsDogYears.ownedCatAndDog(28, 15);
		System.out.println(Arrays.toString(yearsOfCatandDog));
	}
	
	  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
		  int humanYearsCat = 0;
		  if(catYears >= 15 && catYears < 24) {
			  humanYearsCat = 1;
		  }if(catYears >= 24 && catYears < 28) {
			  humanYearsCat = 2;
		  }if(catYears >= 28) {
			  humanYearsCat = ((catYears-15-9)/4)+2;
		  }
		  
		  int humanYearsDog = 0;
		  if(dogYears >= 15 && dogYears < 24) {
			  humanYearsDog = 1;
		  }if(dogYears >= 24 && dogYears < 29) {
			  humanYearsDog = 2;
		  }if(dogYears >= 29) {
			  humanYearsDog = ((dogYears-15-9)/5)+2;
		  }
		  
		  	return new int[]{humanYearsCat, humanYearsDog};
		  }
}
