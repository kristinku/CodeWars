/*
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed 
 * a string and you must return that string in an array where an uppercase letter is a person standing up
 * Rules:
 *  1.  The input string will always be lower case but maybe empty.
 *  2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 *  
 * Example: wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */

package mexicanWave;

import java.util.Arrays;

public class MexicanWave {
	public static void main(String[] args) {
	String wave = "two words";
	String[] bigWave = MexicanWave.wave(wave);
	System.out.println(Arrays.toString(bigWave));
	}
	
    public static String[] wave(String str) {
    	String[] newWave =  new String[str.length()];
    	for(int i = 0; i < str.length(); i++) {
    		String begin = "";
    		if(i != 0) {
    			begin = str.substring(0, i);
    		}
    		String buchstabe = str.substring(i, i+1).toUpperCase();
    		if(buchstabe.equals(" ")) {
    			continue;
    		}
    		String end = "";
    		if(i != str.length()-1) {
        		end = str.substring(i+1, str.length()); 
    		}
    		newWave[i] = begin + buchstabe + end;
    	}
    	
        return Arrays.stream(newWave).filter(word -> word != null).toArray(String[]::new);
        
        		}
}
