package findOdd;
// Given an array of integers, find the one that appears an odd number of times.There will always be only one integer that appears an odd number of times.

import java.util.HashMap;

public class FindOdd {
	public static void main(String[] args) {
	int[] numbers = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};	
	int oddNumber = FindOdd.findIt(numbers);
	System.out.println(oddNumber);
	}
	
	public static int findIt(int[] a) {
		HashMap <Integer, Integer> numbers = new HashMap<Integer, Integer>();
		for(int numb : a) {
			if(numbers.containsKey(numb)) { //Wenn Map die Nummer schon beinhaltet
				int value = numbers.get(numb); //dann hol dir den Wert (Value) der Nummer
				numbers.put(numb, ++value);	//Zähl hoch und speichern
			} else {
				numbers.put(numb, 1);
			}
		}
		return numbers
				.entrySet()//von der HashMap erstellen wir ein Set von allen einträgen der Map
				.stream() //daraus erstellen wir uns einen Stream (Ähnlich einer for Schleife)
				.filter(entry -> entry.getValue()%2==1) //Wir filtern alle Einträge heraus die gerade Werte haben
				.findFirst() //wir holen uns den ersten passenden Eintrag
				.get() //wir sind uns sicher das der Eintrag existiert
				.getKey();//wir holen uns von dem eintrag den Schlüsselwert.
	  }
}
