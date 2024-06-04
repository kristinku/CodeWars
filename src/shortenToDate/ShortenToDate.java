//Input will always be a string, e.g., "Friday May 2, 7pm". 
//Output will be the shortened string, e.g., "Friday May 2".

package shortenToDate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShortenToDate {
	public static void main(String[] args) {
		String longs = ShortenToDate.shortenToDate2("Friday May 2, 7pm");
		System.out.println(longs);

	}

	public static String shortenToDate(String longDate) {
		return longDate.split(",")[0];
	}

//Zweite Lösung mit Regex:
	public static String shortenToDate2(String longDate) {
		String pattern = "^(.*?)\\,.*";
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(longDate);

		if (m.find()) {
			return (m.group(1));
		} else {
			return ("NO MATCH");
		}
	}
//Lösung aus Codewars mit Substring: 
//   return longDate.substring(0, longDate.indexOf(','));
}
