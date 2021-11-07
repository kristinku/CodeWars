package yesOrNo;

public class YesOrNo {

	public static void main(String[] args) {
		String ergebnis = YesOrNo.boolToWord(true);
		System.out.println(ergebnis);
	}

	public static String boolToWord(boolean b) {
		if (b == true) {
			return "Yes";
		}
		else {return "No";}
	}

}
