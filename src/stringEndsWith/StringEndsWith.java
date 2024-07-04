//Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string). 

package stringEndsWith;

public class StringEndsWith {
	public static void main(String[] args) {
		boolean resultEndsWith = StringEndsWith.solution("abcd", "cd");
		System.out.println(resultEndsWith);
	}

	public static boolean solution(String str, String ending) {
		if(ending.length()>str.length())return false;
		if(ending.length()==0) return true;
		String[] newStr = new StringBuilder(str).reverse().toString().split("");
		String[] newEnding = new StringBuilder(ending).reverse().toString().split("");

		for (int i = 0; i < newEnding.length; i++) {
			if (!newEnding[i].equals(newStr[i])) {
				return false;
			}
		}
//Alternative For Schleife, reverse und splitten hier nicht nötig:	
//		for (int i = 0; i < ending.length(); i++) {
//			if (ending.charAt(ending.length()-i-1)!=(str.charAt(str.length()-i-1))) {
//				return false;
//			}
//		}
		
		return true;
	}
}


