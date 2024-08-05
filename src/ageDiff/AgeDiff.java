package ageDiff;

public class AgeDiff {
	public static void main(String[] args) {
		String result = AgeDiff.CalculateAge(2005, 2004);
		System.out.println(result);
	}

	public static String CalculateAge(int birth, int yearTo) {
		int number = 0;
		if (birth == yearTo) {
			return "You were born this very year!";
		} else if (birth < yearTo) {
			number = yearTo-birth;
			return "You are " + number + " year" + (number == 1 ? "" : "s") + " old.";
		} else {
			number = birth-yearTo;
			return "You will be born in " + number + " year" + (number == 1 ? "" : "s") + ".";
		}
	}
}
