//The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy such that the savings over the normal high street price would effectively cover the cost of your holiday.
//You will be given the high street price (normPrice, in £ (Pounds)), the duty free discount (discount, in percent) and the cost of the holiday (in £).

package dutyFree;

public class DutyFree {
	public static void main(String[] args) {
		int nP = 50;
		int d = 20;
		int h = 600;
		int endresult = DutyFree.dutyFree(nP, d, h);
		System.out.println(endresult);
	}
	 public static int dutyFree(int normPrice, int discount, int hol) {
		    double ersparnis = Double.valueOf(normPrice) / 100.0 * discount;
		    Double flaschen = Double.valueOf(hol) / ersparnis;
		    return flaschen.intValue();
		    
		  }
//Lösung von Codewars: hier wurde vermieden das mit Kommazahlen gerechnet wird deswegen kein double nötig	 
	 public static int dutyFree2(int normPrice, int discount, int hol) {
		    return hol*100/(normPrice*discount);
	 }
	 
//Lösung von Codewars: hier wird mit dem f hinter 100, Java mitgegeben das mit float gerechnet werden soll
//Dann wird mit (int) cast wieder zu int umgewandelt
	 public static int dutyFree3(int normPrice, int discount, int hol) {
	    return (int)(hol / (normPrice / 100.0f * discount));
}
