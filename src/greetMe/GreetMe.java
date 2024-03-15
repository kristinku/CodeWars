package greetMe;

public class GreetMe {
	public static void main(String[] args) {
		String hello = GreetMe.greet("JACK");
		System.out.println(hello);
	}
	
	  public static String greet(String name){
		  String lowerCaseName = name.toLowerCase();
		  String capitalName = lowerCaseName.substring(0, 1).toUpperCase() + lowerCaseName.substring(1);
		   return "Hello " + capitalName + "!";
		  }
}

//Von Codewars Einzeiler:
//return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
