package starshipEnterprise;

public class StarshipEnterprise {
	public static void main(String[] args) {
		String greet = StarshipEnterprise.sayHello("Mr. Spock");
		System.out.println(greet);
		
	}
	  public static String sayHello(String name) {
	        return "Hello"+ ", " + name; 
	    }
}
