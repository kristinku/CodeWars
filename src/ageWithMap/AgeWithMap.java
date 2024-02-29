//Map erstellen mit Alter und Anzahl der Personen in dem jeweiligen Alter. Map hat immer einen Key und Value.
//Set ist nur Key. Map nimmt man wenn man etwas nur einmal braucht und zu jeden Key noch einen Wert/info hat.

package ageWithMap;

import java.util.HashMap;
import java.util.Map;

public class AgeWithMap {
	public static void main(String[] args) {
		int[] ages = {36, 85, 36, 54, 11, 36};
		Map<Integer, Integer> numberOfAges = AgeWithMap.sumAge(ages);
		System.out.println(numberOfAges);
		
	}
    public static Map<Integer, Integer>  sumAge(int[] arr) {
    	Map<Integer, Integer> numberOfAges = new HashMap<Integer, Integer>(); //new ist immer ein Konstruktor Aufruf, Konstruktor erstellt ein Objekt
    	for(int a : arr) {
    		if(!numberOfAges.containsKey(a)) {
    			numberOfAges.put(a, 1);
    		}else {
    			numberOfAges.put(a, numberOfAges.get(a)+1);
    		}
     	}  
    	
    	return numberOfAges;
    }
}
