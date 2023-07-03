//Alex just got a new hula hoop, he loves it but feels discouraged because his little brother is better than him
//Write a program where Alex can input (n) how many times the hoop goes round and it will return him an encouraging message 
//If Alex gets 10 or more hoops, return the string "Great, now move on to tricks".
//If he doesn't get 10 hoops, return the string "Keep at it until you get it".

package helpAlex;

public class HelpAlex {
	public static void main(String[] args) {
	int hoopGoesround = 9; 
	String endresult = HelpAlex.hoopCount(hoopGoesround);
	System.out.println(endresult);
	}
	  public static String hoopCount(int n){
		  if(n < 10) {
			  return "Keep at it until you get it";
		  } else
		   return "Great, now move on to tricks";
		  }
}
