package consecutive;

public class Consecutive {
	public static void main(String[] args) {
		int[] arrayOfNumbers = {1, 2, 3, 5, 6};
		Integer firstNonconsecutiveNumber = Consecutive.find2(arrayOfNumbers);
		System.out.println(firstNonconsecutiveNumber);
	}
	
    static Integer find(final int[] array) {
    	for(int i = 1; i < array.length; i++) {
    		if(array[i] == array[i-1]+1) {
    			continue;
    		} else {
    			return array[i];
    		}
    	}
        return null;
    }
    static Integer find2(final int[] array) {
    	for(int j = array[0], k = 0; j < array.length; j++, k++) {
    		if(j == array[k]) {
    			continue; 
    		} else {
    			return array[k];
    		}
    	}
    	 return null;
    }

}
