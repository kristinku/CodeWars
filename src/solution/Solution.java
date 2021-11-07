package solution;

public class Solution {

	public static void main(String[] args) {
		int ergebnis = Solution.century(201);
		System.out.println(ergebnis);
	}

	public static int century(int number) {
		int start = 1;
		int end = 100;
		int result = 1;
		for (int i = 0; true; i++) {
			if (number >= start && number <= end) {
				return result;
			} else {
			start = start + 100;
			end = end + 100; 
			result = result + 1; 
			
			}
		}

	}

}
