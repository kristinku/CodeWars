//Write a function which calculates the average of the numbers in a given list.
//Note: Empty arrays should return 0.
package find_average;

public class Find_average {
	public static void main(String[] args) {
		int[] value = {1, 2};
		double endresult = Find_average.find_average(value);
		System.out.println(endresult);

	}
	  public static double find_average(int[] array){ // int sind Ganzzahlen 5, 8 usw. double sind Kommazahlen und Ganzzahlen 4,5 ; 8 usw
		  double length = array.length;				  // ein int braucht weniger speicher als ein double
		  double sum = 0;
		  for (int i = 0; i < array.length; i++) {
				sum = sum + (array[i]); // Neue Summe = Alte Summe + aktueller Wert vom Array
		  }		  			  
		  if (length > 1) {
		  	return sum/length;
			  
		} else {
			return 0;
	  } 
  }
	 
}
