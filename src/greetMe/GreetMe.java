//Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.
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
//
//Von Codewars mit CharAT: 
//public static String greet(String name){
//    char temp = Character.toUpperCase(name.charAt(0));
//    String temp2 = name.substring(1).toLowerCase();
//    return "Hello "+temp+temp2+"!";
//  }
