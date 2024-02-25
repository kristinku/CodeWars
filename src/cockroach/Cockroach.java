//The cockroach is one of the fastest insects. Write a function which takes its speed 
//in km per hour and returns it in cm per second, rounded down to the integer (= floored).
//Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
package cockroach;

public class Cockroach {
	public static void main(String[] args) {
		Cockroach objectCockroach = new Cockroach();
		int cmPerSecond = objectCockroach.cockroachSpeed(1.08);
		System.out.println(cmPerSecond);
	}

	public int cockroachSpeed(double x) {
		return (int)(x*100000)/3600;
	}
}
