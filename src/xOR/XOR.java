package xOR;

public class XOR {
	public static void main(String[] args) {
		boolean result = XOR.xor(true, false);
		System.out.println(result);
	}
	
    public static boolean xor(boolean a, boolean b) {
    	if(a==b) {
    		return false;
    	}
    	return true;
    }
    //Kurzschreibweise
    public static boolean xor2(boolean a, boolean b) {
    	return !a==b;
    }
}
