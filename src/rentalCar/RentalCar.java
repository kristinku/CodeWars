/*
 * After a hard quarter in the office you decide to get some rest on a vacation. 
 * So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
 * You will need a rental car in order for you to get around in your vacation. 
 * The manager of the car rental makes you some good offers.
 * Every day you rent the car costs $40. If you rent the car for 7 or more days, 
 * you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
 * Write a code that gives out the total amount for different days(d).
 */

package rentalCar;

public class RentalCar {
	public static void main(String[] args) {
		int rentDays = 10;
		int totalPriceforRent = RentalCar.rentalCarCost(rentDays);
		System.out.println(totalPriceforRent);
		
	}
	//Zweite Lösung kürzer
	  public static int rentalCarCost(int d) {
		  int amountPerDay = 40 * d ; 
		  if (d < 7 && d > 3) {
			  amountPerDay = amountPerDay - 20;
		  } else if (d > 7){
			  amountPerDay = amountPerDay - 50;
		  }
		  
		  return amountPerDay;
	  }
	  //Erste Lösung
	   public static int rentalCarCost2(int d) {
			  int amountPerDay = 0 ; 
			  if(d < 3) {
				  amountPerDay = 40 * d;
			  } else if (d < 7) {
				  amountPerDay = 40 * d - 20;
			  } else {
				  amountPerDay = 40 * d - 50;
			  }
			  
			  return amountPerDay;
		  }
	}

}
