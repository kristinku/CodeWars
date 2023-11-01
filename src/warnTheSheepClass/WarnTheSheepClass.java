package warnTheSheepClass;



public class WarnTheSheepClass {
	public static void main(String[] args) {
		String[] flockOFSheep = { "sheep", "sheep", "wolf", "sheep" };
		String shepherdCall = WarnTheSheepClass.warnTheSheep(flockOFSheep);
		System.out.println(shepherdCall);

	}

	public static String warnTheSheep(String[] array) {
		int countSheep = 0;
		for(int i = array.length - 1; i>=0; i--) {
			if("wolf".equals(array[array.length - 1])) {
				return "Pls go away and stop eating my sheep";
			} else if("wolf".equals(array[i])){
				return "Oi! Sheep number " + countSheep +"! You are about to be eaten by a wolf!";
			} else {
				countSheep++;
			}
		}
		throw new IllegalArgumentException();
	}
}
