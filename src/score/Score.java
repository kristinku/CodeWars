package score;

public class Score {
	public static void main(String[] args) {
		int[] classPoints = {100, 20, 60, 50, 20, 60, 50, 90};
		int yourPoints = 90;
		boolean betterOrnot = Score.betterThanAverage(classPoints, yourPoints);
		System.out.println(betterOrnot);
	}
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		int sumOtherResults = 0;
		for(int i = 0; i < classPoints.length; i++ ) {
			sumOtherResults = sumOtherResults + classPoints[i];
		}
		int sumResults = (sumOtherResults + yourPoints)/(classPoints.length+1);
		return yourPoints > sumResults ? true : false;
	}
}
