package printArray;

import java.util.Arrays;

public class PrintArray {
	public static void main(String[] args) {
		String[] words = {"h","o","l","a"};
		String word = PrintArray.printArray(words);
		System.out.println(word);
	}
	
    public static String printArray(Object[] array) {
    	String word = Arrays.toString(array);
        return word.replace("]",  "").replace("[",  "").replace(" ",  "");
      }

    
//Lösung mit Stream von Codewars:  
    public static String printArray0(Object[] array) {
    	return ((String)Arrays.stream(array).reduce("", (subtotal, element)-> PrintArray.reduceArray(subtotal, element)));
    }
    private static String reduceArray(Object subtotal, Object element) {
    	if(subtotal.equals("")) {
    		return ""+ subtotal + element;
    	} else {
    		return ""+ subtotal + "," + element;
    	}
    }
}
