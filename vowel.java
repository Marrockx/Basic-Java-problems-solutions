package Tutorial;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char 	letter;
		System.out.println("Your name:"); 
		Scanner scanner = new Scanner(System.in);
		String 	name = scanner.next(); //assume ‘scanner’ is created properly
		int 		numberOfCharacters 	= name.length();
		int 		vowelCount		= 0;
		for (int i = 0; i < numberOfCharacters; i++) {	
			letter = name.charAt(i);
			if (		letter == 'a' || letter == 'A' ||
				 	letter == 'e' || letter == 'E' ||
				 	letter == 'i' || letter == 'I' ||
				 	letter == 'o' || letter == 'O' ||
				 	letter == 'u' || letter == 'U' 								 					) {		
				vowelCount++;
			}
		}
		System.out.print(name + ", your name has " + vowelCount + " vowels");

	}

}
