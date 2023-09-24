//Write a function that removes the spaces from the string, then return the resultant string. Example: "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"

package noSpacesString;

public class NoSpacesString {
	public static void main(String[] args) {
		String newS = NoSpacesString.noSpace("8 j 8   mBliB8g  imjB8B8  jl");
		System.out.println(newS);
	}
	
    public static String noSpace(final String x) {
    	return x.replace(" ", "");
        
    }
}
