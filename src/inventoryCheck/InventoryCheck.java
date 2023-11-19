//Wir haben Inventur und wollen mit einen Scanner die Möbel im Büro prüfen, ob diese bereits in unserer Inventurliste vom Typ String vorhanden sind. 

package inventoryCheck;

import java.util.List;

public class InventoryCheck {
	public static void main(String[] args) {
		List<String> inventoryList = List.of("Tisch 501", "Tisch 502", "Stuhl 412");
		String scannerInput = "Tisch 501";
		boolean check = InventoryCheck.scanner(scannerInput, inventoryList);
		System.out.println(check);
	}
		
	public static boolean scanner(String input, List<String> inventoryList) {
		for(String l : inventoryList) {
			if(l == input) {
				return true;
			}
			
		}
		return false;
	}
//Zweite Lösungsart: 
	public static boolean scanner2(String input, List<String> inventoryList) {
		return(input != null && inventoryList.contains(input));
	}
}
