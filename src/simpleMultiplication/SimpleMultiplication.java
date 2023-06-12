//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

package simpleMultiplication;

public class SimpleMultiplication {
	public static void main(String[] args) {
		int endresult = SimpleMultiplication.simpleMultiplication(2);
		System.out.println(endresult);
	}
	
    public static int simpleMultiplication(int n) {
    	if (n %2 == 0) {
    	   	return n * 8;
    	} else {
			return n * 9;
    	}
    }
}
