//Nathan loves cycling. Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
//For example:
//time = 3 ----> litres = 1
//time = 6.7---> litres = 3
//time = 11.8--> litres = 5

package keepHydrated;


public class KeepHydrated {
	public static void main(String[] args) {
		double time = 5;
		KeepHydrated objectKeepHydrated = new KeepHydrated(); //Da Funktion nicht static ist muss ein Objekt für den Funktionsaufruf von der Klasse erstellt werden.
		int litresOfWater = objectKeepHydrated.Liters(time);
		System.out.println(litresOfWater);

	}
	
	  public int Liters(double time)  {
		  double sumLiters = 0.5 * time;
		  return (int)sumLiters; //ich caste das double zu einen int. In der Klammer ist der Typ in der die Variable gecastet werden soll
		  
		  //return (int) (time * 0.5); Einzeilerlösung von Codewars; Cast und Berechnung in einer Zeile
		  }
}
