//You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
//Array can contain numbers or strings. X can be either.
//Return true if the array contains the value, false if not.


package onlyNeedOne;

public class OnlyNeedOne {
	public static void main(String[] args) {
		Object[] objectArray = {2, 3, "Hallo", "me"};
		boolean containsObject = OnlyNeedOne.check(objectArray, "me");
		System.out.println(containsObject);
	}
	
    public static boolean check(Object[] a, Object x) {
    	 for(Object item : a) {  	
    		if(item.equals(x))
    			return true;
    	 }
    	 return false;
    }
}
