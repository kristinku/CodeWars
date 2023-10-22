//For example, if the parameters passed are (2, 6), the function should return [2, 4, 6] as 2, 4, and 6 are the multiples of 2 up to 6.
//There will only ever be positive integers passed into the function, not consisting of 0. The limit will always be higher than the base.

package multiplesOfNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplesOfNumber {
	public static void main(String[] args) {
		int[] numbers = MultiplesOfNumber.find(2, 6);
		System.out.println(Arrays.toString(numbers));
	}
	
    public static int[] find(int base, int limit) {
        List<Integer> newList = new ArrayList<>();
    	for(int i = base; i <= limit; i+=base) { //i+=base zählt i um die 2 hoch 
    		newList.add(i);
    	}
    	
    	return newList.stream().mapToInt(Integer::intValue).toArray();
    }
}
