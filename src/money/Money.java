package money;

public class Money {
	public static void main(String[] args) { 
		double p = 1000.00;
		double i = 0.01625;
		double t = 0.18;
		double d = 1200.00;
		int year = Money.calculateYears(p, i, t, d);
		System.out.println(year);
		
	}
	
	  public static int calculateYears(double principal, double interest,  double tax, double desired) {  		
		  	if(principal == desired) return 0;	
		    int year = 0;
		  	for(int i=1; principal <= desired; i++) {
		  		double iPerYear = principal * interest;
			    double tPerYear = iPerYear * tax;
		  		principal = principal + iPerYear - tPerYear;
		  		year = i;
		  	}
		    
		    return year;
		  	}
	  
}
