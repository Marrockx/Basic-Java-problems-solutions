package Tutorial;
import java.util.*;

public class SelectionStatements {
	
	public static void main(String[] args) {
		
		int temp = 30, distanceToDest = 2;
		if (temp > 40 && distanceToDest < 3) {
			System.out.print("Let's walk.");
		} else {
			System.out.print("Let's drive.");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Score: ");
		int score = sc.nextInt();
		
		if (score >= 90)
			System.out.println("Your grade is A.");
		
		else if (score >= 80) 
			System.out.println("Your grade is B.");
		
		else if (score >= 70)
			System.out.println("Your grade is C.");
		
		else if (score >= 60)
			System.out.println("Your grade is D.");
		
		else 
			System.out.println("Your grade is F.");
		
			
		System.out.println("Enter Your Test Score: ");
		int testScore = sc.nextInt();
		
		System.out.println("Enter Your Age: ");
		int studentAge = sc.nextInt();
		
		if(testScore >= 95) {
			if (studentAge < 10) {
				
				System.out.println("You did a great job.");
			} else {
				
				System.out.println("You did pass and ");
			}
			
			System.out.println("You are an honor student.");
		}
			
		
		else if (testScore < 70)
			{
				System.out.print("You did not pass");
				System.out.println(" Work harder next time.");
			}
				
			else 
			{
				System.out.print("You did pass");
				System.out.println(" Keep it up");
			}	
	}
		
}	