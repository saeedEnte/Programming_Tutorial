import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		
		System.out.println("Please input a grade:");
		Scanner scan = new Scanner(System.in);
		double inpGrade = scan.nextInt();
		double germanGrade = ((100-inpGrade)/50)*3+1.0;
		double deutschScore = germanGrade *10;
		System.out.println("the score in German system is:"+java.lang.Math.floor(deutschScore)/10);
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}
