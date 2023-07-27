//Complete the function so that it finds the average of the three scores 
//passed to it and returns the letter value associated with that grade.

package grassHopper;

public class GrassHopper {
	public static void main(String[] args) {
	int s1 = 50;
	int s2 = 135;
	int s3 = 40;
	char grade = GrassHopper.getGrade(s1, s2, s3);
	System.out.println(grade);
		
	}
    public static char getGrade(int s1, int s2, int s3) {
    	int average = (s1+s2+s3)/3;
    	if(average >= 90 && average <= 100) {
    		return 'A'; 			
    	} if(average >= 80 && average < 90) {
    		return 'B';
    	} if(average >= 70 && average < 80) {
    		return 'C';
    	}if(average >= 60 && average < 70) {
    		return 'D';
    	}else return 'F';
    	
    }
}
