package greeting;

public class Greeting {
	public static void main(String[] args) {
		String ownerOrGuest = Greeting.greet("Otto", "Berta");
		System.out.println(ownerOrGuest);
		
	}
    static String greet(String name, String owner) {
    	return name.equals(owner) ? "Hello boss" : "Hello guest";
    			
    }
}
