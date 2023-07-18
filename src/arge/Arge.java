package arge;

public class Arge {
	public static void main(String[] args) {
		int p0 = 1000;
		double percent = 2;
		int aug = 50;
		int p = 1200;
		int endresult = Arge.nbYearWithWhile(p0, percent, aug, p);
		System.out.println(endresult);
	}
	
    public static int nbYear(int p0, double percent, int aug, int p) {
    	double percentmitkomma = percent / 100;
    	int einwohner = p0;
    	int jahr = 0;
    	for(int i = 0 ; einwohner < p; i++) { //die schleife soll nur laufen wenn einwohner weniger als P sind
        	einwohner = einwohner + (int)(einwohner * percentmitkomma) + aug;
        	jahr = jahr + 1;
       	}
    	return jahr;
    }
    
    public static int nbYearWithWhile(int p0, double percent, int aug, int p) {
    	double percentmitkomma = percent / 100;
    	int einwohner = p0;
    	int jahr = 0;
    	while(einwohner < p) { //die schleife soll nur laufen wenn einwohner weniger als P sind
        	einwohner = einwohner + (int)(einwohner * percentmitkomma) + aug;
        	jahr = jahr + 1;
       	}
    	return jahr;
    }
}


