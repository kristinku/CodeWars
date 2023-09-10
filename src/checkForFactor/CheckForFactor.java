package checkForFactor;

public class CheckForFactor {
	public static void main(String[] args) {
		int base = 6;
		int factor = 3;
		boolean resultOfCheck = CheckForFactor.checkForFactor(base, factor);
		System.out.println(resultOfCheck);
	}
	
    public static boolean checkForFactor(int base, int factor) {
    	return base%factor == 0 ? true : false;
    }
}
