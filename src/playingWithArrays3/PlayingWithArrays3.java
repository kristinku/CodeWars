//Given an array/list [] of integers , Find all the LEADERS in the array. An element is leader if it is greater than The Sum all the elements to its right side.

package playingWithArrays3;
import java.util.ArrayList;
import java.util.List;

public class PlayingWithArrays3 {
	public static void main(String[] args) {
		int[] numbers = {5, 10, 2, 6};
		List<Integer>leaders = PlayingWithArrays3.arrayLeaders(numbers);
		System.out.println(leaders);
	}
    public static List<Integer> arrayLeaders(int[] numbers){
		List<Integer> leaders = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > PlayingWithArrays3.sum(numbers, i)) {
				leaders.add(numbers[i]);
			}
		}
        return leaders; 
    }
    public static int sum(int[] numbers, int i ){
    	int sum = 0;
    	for(int j = i+1; j < numbers.length; j++) {
    		sum += numbers[j];
    		} 
    	return sum;
    }
}
//Lösung von Codewars: Rückwärts 
//public static List arrayLeaders(int[] n) {
//    List<Integer> ary = new ArrayList<>();
//    for (int i = n.length-1, sum = 0; i >= 0; i--) {
//      if (n[i] > sum) ary.add(0, n[i]);
//      sum += n[i];
//    }
//    return ary;
//  }
