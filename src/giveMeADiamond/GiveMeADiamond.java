package giveMeADiamond;

public class GiveMeADiamond {
	public static void main(String[] args) {
		String printDiamond = GiveMeADiamond.print(5);
		System.out.println(printDiamond);
	}
	
	public static String print(int n) {
		if (n % 2 == 0 || n < 0) {
			return null;
		}
		String diamond = "";
		int average = (int) (Double.valueOf(n) / 2 + 0.5);
		for (int i = 1, sterne = 1; i <= n; i++) {
			diamond += " ".repeat(Math.abs(average - i)).concat("*".repeat(sterne)).concat("\n");
			if (i < average) {
				sterne += 2;
			}
			if (i >= average) {
				sterne -= 2;
			}
		}
		return diamond;
	}
}
