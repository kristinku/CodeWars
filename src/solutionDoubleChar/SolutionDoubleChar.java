package solutionDoubleChar;

public class SolutionDoubleChar {
	public static void main(String[] args) {
		String word = "Esel";
		String doubleWord = SolutionDoubleChar.doubleChar(word);
		System.out.println(doubleWord);
	}
	  public static String doubleChar(String s){
		  char[] sChar = s.toCharArray();
		  char[] biggersChar = new char[sChar.length*2];
		  for(int i = 0; i < sChar.length; i++) {
			  biggersChar[i*2] = sChar[i];
			  biggersChar[i*2+1] = sChar[i];
		  }
		  
		  return String.valueOf(biggersChar); 
	  }
}
