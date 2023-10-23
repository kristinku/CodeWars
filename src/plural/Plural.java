package plural;

public class Plural {
	public static void main(String[] args) {
		boolean trueOrFalse = Plural.isPlural(1f);
		System.out.println(trueOrFalse);
	}

	public static boolean isPlural(float f) {
		return f == 1 ? false : true;

	}
}
