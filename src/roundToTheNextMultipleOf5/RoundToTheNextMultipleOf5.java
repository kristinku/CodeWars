//Given an integer as input, can you round it to the next (meaning, "greater than or equal") multiple of 5? Input may be any positive or negative integer (including 0).
//Examples:
//input:    output:
//0    ->   0
//2    ->   5
//3    ->   5

package roundToTheNextMultipleOf5;

public class RoundToTheNextMultipleOf5 {
	public static void main(String[] args) {
		int endresult = RoundToTheNextMultipleOf5.roundToNext5sec(4);
		System.out.println(endresult);
		
	}
	//Ausprobierlösung:
	  public static int roundToNext5(int number) {		  
		  for(; number % 5 != 0; number++) {
			   
		  }
		  return number;

		 
		}
	//Mathematische Lösung:
	  public static int roundToNext5sec(int number) {
		  if(number % 5 == 0) {
			  return number;
		  } else {
			  int firstOf = number / 5;
			  return number > 0 ? (firstOf + 1) * 5 : firstOf * 5;
		  }
		  
	  }	 
}
