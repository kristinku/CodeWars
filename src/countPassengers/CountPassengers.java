//There is a bus moving in the city which takes and drops some people at each bus stop.
//
//You are provided with a list (or array) of integer pairs. Elements of each pair represent the number of people that get on the bus (the first item) and the number of people that get off the bus (the second item) at a bus stop.
//
//Your task is to return the number of people who are still on the bus after the last bus stop (after the last array). Even though it is the last bus stop, the bus might not be empty and some people might still be inside the bus, they are probably sleeping there :D
//
//Take a look on the test cases.
//
//Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the returned integer can't be negative.
//
//The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.

package countPassengers;

import java.util.ArrayList;

public class CountPassengers {
	public static void main(String[] args) {
		int[] haltestelle1 = { 5, 0 };
		int[] haltestelle2 = { 4, 3 };
		int[] haltestelle3 = { 2, 7 };
		ArrayList<int[]> busfahrt = new ArrayList<>();
		busfahrt.add(haltestelle1);
		busfahrt.add(haltestelle2);
		busfahrt.add(haltestelle3);
		int personenImBusEnde = CountPassengers.countPassengers(busfahrt);
		System.out.println(personenImBusEnde);

	}

	public static int countPassengers(ArrayList<int[]> stops) {
		int personenImBus = 0;
		for (int i = 0; i < stops.size(); i++) {
			int[] halt = stops.get(i);
			personenImBus = personenImBus + (halt[0]) - (halt[1]);
		}
		return personenImBus;
	}
}
