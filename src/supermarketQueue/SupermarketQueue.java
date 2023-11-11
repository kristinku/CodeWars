package supermarketQueue;

import java.util.Arrays;


public class SupermarketQueue {
	public static void main(String[] args) {
		int[] customersTime = { 10, 2, 3, 3 };
		int till = 2;
		int time = SupermarketQueue.solveSuperMarketQueue(customersTime, till);
		System.out.println(time);
	}

	public static int solveSuperMarketQueue(int[] customers, int n) {
		if (n == 1) {
			return Arrays.stream(customers).reduce(0, (subtotal, element) -> subtotal + element); // Wenn nur 1 Kasse auf ist summiertes die Zeit der customer
																								
		}
		int[] tills = new int[n]; // neues Array mit Größe n erstellt;
		for (int customer : customers) {
			int smallest = SupermarketQueue.getIndexOfSmallestValue(tills); //Funktionsaufruf und speichern
			tills[smallest] = tills[smallest] + customer;
		}
		
		return tills[SupermarketQueue.getMaxIndex(tills)]; //gibt Wert vom größten Index von Tills zurück 
	}
	
	private static int getMaxIndex(int[] tills) { //Aus Array tills mit Customer suchen wir die längste Schlange
		int maxAt = 0;
		for (int i = 0; i < tills.length; i++) {
		    maxAt = tills[i] > tills[maxAt] ? i : maxAt;
		}
		return maxAt;
	}

	private static int getIndexOfSmallestValue(int[] tills) { // kleinste Wert der Kassen bis jetzt
		Integer lowestInt = null;
		Integer indexLowestInt = null;
		for (int i = 0; i < tills.length; i++) {
			if (lowestInt == null || tills[i] < lowestInt) {
				lowestInt = tills[i];
				indexLowestInt = i;
			}
		}
		return indexLowestInt;
	}
}

//Lösung von Person aus Codewars: 
//public static int solveSuperMarketQueue(int[] customers, int n) {
//    int[] result = new int[n];
//		  for(int i = 0; i < customers.length; i++){
//	    	result[0] += customers[i];
//	    	Arrays.sort(result); // wird nach Größe sotiert, es steht dann immer der kleinste Wert an erster stelle. 
//	    }
//		  return result[n-1]; // um den Wert zu erhalten muss bei n - 1 abgezogen werden. z.B.n = 2; [5,6] hat den Index 0,1.
//  }						  // Wert 6 ist die Lösung an Index 1 ( n 2 - 1)
// 
//Beispiel: customers 5,4,2
//[0,0] -> erster customer 5 = [5,0] -> dann wird sortiert = [0,5]
//[0,5] -> zweiter customer 4 = [4,5] -> dann wird sortiert = [4,5]
//[4,5] -> dritter customer 2 = [6,5] -> dann wird sortiert = [5,6]
//Ergebnis ist 6
