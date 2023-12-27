//Rake out any items that are not a rock or gravel and replace them with gravel.

package suzukisGarden;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SuzukisGarden {
	public static void main(String[] args) {
		String rakedGarden = SuzukisGarden.rakeGarden("slug spider rock gravel gravel gravel gravel gravel gravel gravel");
		System.out.println(rakedGarden);
	}
	  public static String rakeGarden(String garden) {
		  String[] words = garden.split(" ");
		  for(int i = 0; i < words.length; i++) {
			  if(!words[i].equals("rock") && !words[i].equals("gravel")) {
				  words[i] = words[i].replaceAll(words[i], "gravel");
			  }
		  }
	      return Arrays.stream(words).collect(Collectors.joining(" "));
	    }
}
