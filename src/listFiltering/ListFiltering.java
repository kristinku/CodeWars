//In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

package listFiltering;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
	public static void main(String[] args) {
		List<Object> inputList = List.of(1, 2, "a", "b");
		List<Object> newList = ListFiltering.filterList(inputList);
		System.out.println(newList);
		
	}
	
	  public static List<Object> filterList(final List<Object> list) {
		  List<Object> numbers = new ArrayList<Object>();
		 for(Object item : list) {
			 try {
				 int zahl = (int) item;
				 numbers.add(zahl);
			 } catch(Exception e) {
				 // item war keine zahl, Fehler wurde geworfen, gefangen und nun ignoriert
			 }
		 }
		  return numbers;
	  }
}
