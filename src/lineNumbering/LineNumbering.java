package lineNumbering;

import java.util.Arrays;
import java.util.List;

public class LineNumbering {
	public static void main(String[] args) {
        List<String> myList = Arrays.asList("a", "b", "c");
        List<String> endresult = LineNumbering.number(myList);
        System.out.println(endresult);
     	}
	
	
    public static List<String> number(List<String> lines) {
    	for(int i=0; i<lines.size(); i++) {	//Aufbau Schleife: startwert für schleife;prüfung für schleife;zählt hoch
			String anfangswert = Integer.toString(i+1);
    		lines.set(i, anfangswert + ": " + lines.get(i)); // lines.get(i)) erhalte Wert der Liste an der Stelle i
    	}
        return lines;
    }
}


