package inverter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;

public class Inverter {
	public static void main(String[] args) {
		String response = Inverter.getNumberFromInverter(); //
		Inverter.writeToFile(response); //Funktionsaufruf der nichts zurück gibt.
		int numberFromInverter = Inverter.parseNumber(response);
		System.out.println(numberFromInverter);
		

	}
		
	 public static int parseNumber(String number){
		  String[] sNumber = number.split(" ");
		  int iNumber = Integer.parseInt(sNumber[0]);
		  return iNumber;
	 }
	 
	 public static String getNumberFromInverter() {
		 StringBuilder result = new StringBuilder();
		 URL url;
		try {
			url = new URL("http://localhost:8080/wechselrichter");
			 HttpURLConnection con = (HttpURLConnection) url.openConnection();
			 con.setRequestMethod("GET");
		      try (BufferedReader reader = new BufferedReader(
	                  new InputStreamReader(con.getInputStream()))) {
	          for (String line; (line = reader.readLine()) != null; ) {
	              result.append(line);
	          }
	      }
	      return result.toString();
		} catch (MalformedURLException e) {
			throw new RuntimeException("String is not a URL");
		} catch (IOException e) {
			throw new RuntimeException("Could not connect to the server");
		}
		
	 }
	 	public static void writeToFile(String response) { //Funktion speichert response in eine Datei, direkt die Daten vom Wechselrichter.
	 		File file = new File("Logbuch.txt");
	 		response = LocalDateTime.now().toString() + ": " + response;
	 		try {
	 		   BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)); //Erzeugen eines effizienten Writers(Klasse die sich ums schreiben von Werten kümmert) für Textdateien
	 		   writer.write(response);
	 		   writer.newLine();
	 		   writer.close();
	 		}
	 		catch(IOException ioe) {
	 		   System.err.println(ioe);
	 	}
	 	
 	}
}
