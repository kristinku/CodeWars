/*
A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a 
couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. 
Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, 
will he survive? Return true if yes, false otherwise
*/		

package dragon;

public class Dragon {
	public static void main(String[] args) {
		int numberOfDragons = 4;
		int numberOfbullets = 8;
		boolean endresult = Dragon.hero(numberOfbullets, numberOfDragons);
		System.out.println(endresult);
	}
	
	  public static boolean hero(int bullets, int dragons) {
		  int possibilityDeathOfDragon = bullets / 2; 
		  if (possibilityDeathOfDragon >= dragons) {
			  return true;
		  } else {
			  return false;
		  }
		}
}
