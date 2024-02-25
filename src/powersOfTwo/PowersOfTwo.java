package powersOfTwo;

import java.util.Arrays;

public class PowersOfTwo {
	public static void main(String[] args) {
		long[] exponentOfTwo = PowersOfTwo.powersOfTwo(5);
		System.out.println(Arrays.toString(exponentOfTwo));
	}

	public static long[] powersOfTwo(int n){
		 long[] exponent = new long[n+1];
		 for(int i = 0; i <= n; i++) {
			 if(i == 0) {
				exponent[0] = 1;
			 }
			 else {
				 exponent[i] = exponent[i-1] *2;
			 }
		
		 }
		 return exponent;
	  }
}
