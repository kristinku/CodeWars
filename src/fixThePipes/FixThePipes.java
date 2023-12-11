package fixThePipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixThePipes {
	public static void main(String[] args) {
		int[] brokenPipe = {1,3,5,6,7,8};
		int[] fixedPipe = FixThePipes.pipeFix(brokenPipe);
		System.out.println(Arrays.toString(fixedPipe));
	}
	  public static int[] pipeFix(int[] numbers) {
		  List<Integer> newPipe = new ArrayList<>();  
		  for(int i = numbers[0]; i <= numbers[numbers.length-1]; i++) {
			  newPipe.add(i);
		  }
	    	return newPipe.stream().mapToInt(Integer::intValue).toArray();
	  }
}
