//Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, 
//saying each of the following phrases each time a petal was torn.

package tearPetals;

public class TearPetals {
	public static void main(String[] args) {
		String phrases = TearPetals.howMuchILoveYou(6);
		System.out.println(phrases);
	}
    public static String howMuchILoveYou(int nb_petals) {
    	switch(nb_petals % 6) {
    	case 1: 
    		return "I love you";
    	case 2: 
        	return "a little";
    	case 3: 
        	return "a lot";
    	case 4: 
        	return "passionately";	
    	case 5: 
        	return "madly";
    	default:
           	return "not at all";
    	   	
    	}

    }
	
}
