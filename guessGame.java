package Tutorial;
import java.util.*;


public class guessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		Random random = new Random();
		int secretNo = random.nextInt(100);
		int guess;
		int guessCount = 0;
		do {
			System.out.print("Enter a guess number between 1 and 100: ");
			guess = sc.nextInt();
			guessCount++;
			
			if (guess < secretNo) {
				System.out.println(" LO ");
			} else if(guess > secretNo) {
				System.out.println(" HI ");
			}
		} while(guessCount < 6 && guess != secretNo); 
		
		if (guess == secretNo) {
			System.out.print("You guessed right!! Yay!! ");
		} else {
			System.out.print("wrong guess, try again!!");
		}

	}

}
