// In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
//Kata.makeNegative(1);  // return -1
//Kata.makeNegative(-5); // return -5
//Kata.makeNegative(0);  // return 0

package makeNegative;

public class MakeNegative {
	public static void main(String[] args) {
		int number = 5;
		int negativeNumber = MakeNegative.makeNegative(number);
		System.out.println(negativeNumber);
		
	}
	  public static int makeNegative(final int x) {
		   	int nNumber = 0;
		   	if(x > 0) {
		   		nNumber = x - (x*2);
		   	}else {
		   		return x;
		   	}
		    return nNumber; 
		    
		  }
	  
	  public static int makeNegativeAndiVarianteKürzer(final int x) {
		   	if(x > 0) {
		   		return x - (x*2);
		   	}else {
		   		return x;
		   	}   
		   	
	  }
	  public static int makeNegativeAndiVarianteNochKürzer(final int x) {
		   	if(x > 0) {
		   		return x * -1;
		   	}else {
		   		return x;
		   	}    
	  }
	  public static int makeNegativeAndiVarianteAmKürzesten(final int x) {
		  return x > 0 ? x * -1 : x;
			   		
//schnelle IF else: return Bedingung ?(Bedingung erfüllt) : (:= else, Bedingung nicht erfüllt)
		   	}    
}
