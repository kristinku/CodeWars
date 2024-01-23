package wideMouthedFrog;

public class WideMouthedFrog {
	public static void main(String[] args) {
		String animal = WideMouthedFrog.mouthSize("ALLIGATOR");
		System.out.println(animal);
	}
	  public static String mouthSize(String animal){
		  if(animal.toLowerCase().equals("alligator")) {
			  return "small";
		  }else {
			  return "wide";
		  }
		  
	 }
	  public static String mouthSize2(String animal){
		  return animal.toLowerCase() == "alligator" ? "small" : "wide";
		  
	  } 
	  
//	  Code aus Codewares: 
	  public static String mouthSize3(String animal) {
		    return animal.equalsIgnoreCase("alligator") ? "small" : "wide"; //equals funktion die gleich Groß und Kleinschreibung ignoriert
		  }

}
