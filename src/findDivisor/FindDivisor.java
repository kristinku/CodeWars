package findDivisor;

public class FindDivisor {

	public static void main(String[] args) {
		FindDivisor übung = new FindDivisor();
		long result = übung.numberOfDivisors(500000);
		System.out.println(result);
	}

	public long numberOfDivisors(int n) {
		 long divisors = 0;
		  for (int i = 1; i <= n; i++) {
			 if (n % i == 0) {
				 divisors++;
			 }
		  }
		  return divisors;
	}
}
