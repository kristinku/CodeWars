//Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
//Examples: 6, "I"     -> "IIIIII"
//          5, "Hello" -> "HelloHelloHelloHelloHello

package solutionRepeatStr;

public class SolutionRepeatStr {
	public static void main(String[] args) {
		int number = 5;
		String word = "Hello";
		String endresult = SolutionRepeatStr.repeatStr(number, word);
		System.out.println(endresult);
		
	}
    public static String repeatStr(final int repeat, final String string) { //final bedeutet das der String nicht überschrieben werden kann
    	String repeatString = "";
    	for(int i = 1; i <= repeat; i++) {
    		repeatString = repeatString + string;
    		    	}
        return repeatString;
    }

}
