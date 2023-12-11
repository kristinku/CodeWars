//Build a function that returns an array of integers from n to 1 where n>0.
//Example : n=5 --> [5,4,3,2,1]


package sequence;

import java.util.Arrays;

public class Sequence {
	public static void main(String[] args) {
		int[] reverseArray = Sequence.reverse(5);
		System.out.println(Arrays.toString(reverseArray));
	}
	
	  public static int[] reverse(int n){
		  int[] arr = new int[n];
		  for(int i = n, j = 0; i >= 1; i--, j++) {
			  arr[j] = i;
		  }
		  return arr;
		  }
	  
	  
//Lösung von irgendeiner Person von CODEWARS: 
	  public static int[] reverse1(int n){
		    int[] res = new int[n]; //Neue Liste erstellen
		    for (int i=0; i<n; i++) 
		      res[i]=n-i; //Hier speichert er an der stelle i (bei ihm 0) dann n - i ein (also z.B. beim ersten schleifendurchlauf 5-0, dann bei 2 durchlauf 5-1 usw.
		    return res;
	  }
}

