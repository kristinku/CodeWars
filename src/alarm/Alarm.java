//https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java

package alarm;

public class Alarm {
	public static void main(String[] args) {
		boolean alarm = Alarm.setAlarm(true, false);
		System.out.println(alarm);
		
	}
	  public static boolean setAlarm(boolean employed, boolean vacation) {
		  if(employed == true && vacation == false) {
			  return true;
		  }
		  return false;
	  	}
	  
//Codewars Lösung mit kurzem IF: 
	  public static boolean setAlarmCodewars(boolean employed, boolean vacation) {
	    return employed & !vacation ? true : false;
	  }
}
