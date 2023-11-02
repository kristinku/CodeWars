//https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
package enoughIsEnough;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EnoughIsEnough {
	public static void main(String[] args) {
		int[] allPictures = {1, 2, 3, 1, 3, 4, 1, 2, 2, 2};
		int quantity = 2;
		int[] selectedPictures = EnoughIsEnough.deleteNth(allPictures, quantity);
		System.out.println(Arrays.toString(selectedPictures));
		
	}
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		if (maxOccurrences == 0) return new int[0];
		List<Integer> list = Arrays.stream(elements).boxed().collect(Collectors.toList());
		Map<Integer, Integer> newElements = new HashMap<>();
		for(int i = 0; i< elements.length; i++) {
			if(!newElements.containsKey(elements[i])) { //Wenn Map noch nicht Zahl beinhaltet
				newElements.put(elements[i], 1); //speichert die Häufigkeit 1
			}else {
				if(newElements.get(elements[i]) < maxOccurrences) { //newElements.get gibt die Häufigkeit (value) zurück und wird dann verglichen mit der maximalen Häufigkeit
					newElements.put(elements[i], newElements.get(elements[i]) +1); //addiert auf Häufigkeit 1 und speichert dies
				} else {
					list.set(i, null); //ersetzt die zu häufige Zahl an der Stelle i mit null, weil wir es danach null herausfiltern wollen
				}
			}
		}
		return list.stream().filter(e -> e != null).mapToInt(i->i).toArray(); //filtern was drin bleiben soll, dann wird zu int und dann Array
	}
}
