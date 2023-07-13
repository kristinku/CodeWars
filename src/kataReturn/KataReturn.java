//Make a function that will return a greeting statement that uses an input; 
//your program should return, "Hello, <name> how are you doing today?".
//[Make sure you type the exact thing I wrote or the program may not execute properly]

package kataReturn;


public class KataReturn {
	public static void main(String[] args) {
		String inputName = "Uwe";
		String endresult = KataReturn.greet(inputName);
		System.out.println(endresult);
		
	}
	  public static String greet(String name) {
		  
	  return "Hello, " + name + " how are you doing today?";
	}
}
