package findNeedle;

public class FindNeedle {
	public static void main(String[] args) {
		Object[] heuhaufen = { "hay", 1, false, null, "junk", "hay", "dog", "hay", "moreJunk", "needle", "randomJunk" };
		String endresult = FindNeedle.findNeedle(heuhaufen);
		System.out.println(endresult);
	}

	public static String findNeedle(Object[] haystack) {
		for (int i = 0; i < haystack.length; i++) {
			if ("needle".equals(haystack[i])) {               //if (haystack[i] == "needle") { Meine alte Lösung, ist für Vergleiche bei Objekten zu unsicher
				return "found the needle at position " + i;   // bei Objekten zu unsicher weil equals schlauer ist als == 
			}												  // Objekte verlgeicht man immer mit equals!!!!
		}
	     throw new IllegalArgumentException("The word needle is missing");
	}

}
