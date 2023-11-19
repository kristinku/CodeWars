package welcomeToTheCity;


public class WelcomeToTheCity {
	public static void main(String[] args) {
		String[] name = {"Tom", "Bart"};
		String city = "Phoenix";
		String state = "Arizona";
		WelcomeToTheCity objectWelcomeToTheCity = new WelcomeToTheCity(); 
		String endresult = objectWelcomeToTheCity.sayHello(name, city, state);
		System.out.println(endresult);
	}  
	
	public String sayHello(String [] name, String city, String state){
		String n = String.join(" ", name); //fügt alle Strings mit einem dieser Methode übergebenen Trennzeichen zusammen.
		return "Hello, " + n + "! Welcome to "+  city +", " + state + "!";
	}
}
