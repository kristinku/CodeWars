package totalPoints;

public class TotalPoints {
	public static void main(String[] args) {
		String[] goals = {"3:1", "2:2", "0:1", "3:0", "2:1", "0:2", "3:2", "2:0", "1:1", "0:1"};
		int pointsOfOurTeam = TotalPoints.points(goals);
		System.out.println(pointsOfOurTeam);
	}
	   public static int points(String[] games) {
			 int teamPointsSum = 0;
			 for (String oneString : games) {
				 String[] split = oneString.split(":"); // Trennt den String Anhand des ausgewählten Trennzeichen ":" in ein Array
				 int teamGoals = Integer.parseInt(split[0]); //Nimmt erstes Element vom getrennten string und macht es zu einen int
				 int enemyGoals = Integer.parseInt(split[1]);
				 if(teamGoals > enemyGoals) teamPointsSum += 3; //kurzschreibweise von: teamPointsSum = teamPointsSum + 3
				 if(teamGoals == enemyGoals) teamPointsSum +=1;
				 				  
			 }
			 return teamPointsSum;
		   
		    }
}
