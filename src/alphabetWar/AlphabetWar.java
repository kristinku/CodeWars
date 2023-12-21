//https://www.codewars.com/kata/59377c53e66267c8f6000027/java

package alphabetWar;

public class AlphabetWar {
	public static void main(String[] args) {
		String resultOfWar = AlphabetWar.alphabetWar("qdsejdfwislyzmqizjutrmansxwwiswsewdcducr");
		System.out.println(resultOfWar);
	}

	public static String alphabetWar(String fight) {
		int scoreLeft = 0;
		int scoreRight = 0;
		String[] arrayFight = fight.split("");
		for (String letter : arrayFight) {
			scoreLeft += AlphabetWar.pointsLeftSide(letter); // Punkte aus private Funktionen sammeln
			scoreRight += AlphabetWar.pointsRightSide(letter); // Punkte aus private Funktionen sammeln
		}
		if (scoreLeft < scoreRight) {
			return "Right side wins!";
		}
		if (scoreLeft > scoreRight) {
			return "Left side wins!";
		}
		return "Let's fight again!";
	}

	private static int pointsLeftSide(String letter) {
		int sum = 0;
		if (letter.equals("w")) {
			sum = sum + 4;
		}
		if (letter.equals("p")) {
			sum = sum + 3;
		}
		if (letter.equals("b")) {
			sum = sum + 2;
		}
		if (letter.equals("s")) {
			sum = sum + 1;
		}
		return sum;
	}

	private static int pointsRightSide(String letter) {
		int sum = 0;
		if (letter.equals("m")) {
			sum = sum + 4;
		}
		if (letter.equals("q")) {
			sum = sum + 3;
		}
		if (letter.equals("d")) {
			sum = sum + 2;
		}
		if (letter.equals("z")) {
			sum = sum + 1;
		}
		return sum;
	}
	
//	Code vom Codewars Person mit SwitchCase
//    public static String alphabetWar(String fight){
//        int right = 0, left = 0;
//        for (char c : fight.toCharArray()) {
//          switch (c) {
//            case 'w' : left += 4; break;
//            case 'p' : left += 3; break;
//            case 'b' : left += 2; break;
//            case 's' : left += 1; break;
//            
//            case 'm' : right += 4; break;
//            case 'q' : right += 3; break;
//            case 'd' : right += 2; break;
//            case 'z' : right += 1; break;
//          }
//        }
//        if (left == right) return "Let's fight again!";
//        return (left > right ? "Left" : "Right") + " side wins!";
//      }
}