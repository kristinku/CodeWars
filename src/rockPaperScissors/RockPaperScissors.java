//Let's play! You have to return which player won! In case of a draw return Draw!.
package rockPaperScissors;

public class RockPaperScissors {
	public static void main(String[] args) {
		String theWinnerIs = RockPaperScissors.rps("rock", "scissors");
		System.out.println(theWinnerIs);
	}

	public static String rps(String p1, String p2) {
		if (p1 == p2) {
			return "Draw!";
		}
		if (p1 == "scissors" && p2 == "paper") {
			return "Player 1 won!";
		}
		if (p1 == "paper" && p2 == "rock") {
			return "Player 1 won!";
		}
		if (p1 == "rock" && p2 == "scissors") {
			return "Player 1 won!";
		} else return "Player 2 won!";
		
	}
//LÖSUNG MIT Schnellen IF aus Codewars: 
//	  public static String rps2(String p1, String p2) {
//		    if(p1 == p2) return "Draw!";
//		    int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
//		    return "Player " + p + " won!";
//		  }
}



