package stringFormat;

public class StringFormat {
	public static void main(String[] args) {
		String data = StringFormat.format("Hennri", 25, "Februar");
		System.out.println(data);
	}
    public static String format(String name, int day, String month) {
    	String myString = "Hallo %s! Heute ist der %d %s.";
    	String result = String.format(myString, name, day, month);
      	 return result;
    }
}
