package ourpackage;
import java.util.Scanner;
import java.util.Random;
public class Myclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int lowerbound = 1;
		int upperbound = 100;
		int generatedNumber = rn.nextInt(upperbound- lowerbound+1)+lowerbound;
		int maxAttempts = 10;
		int attempts = 0;


		
	System.out.println("Random Number Guessing App!");
	System.out.println("We have selected a number between "+lowerbound+ "and " + upperbound+ ".Try to guess it." );
	
	while(attempts<maxAttempts) {
		System.out.println("Enter your guess number:");
		int userGuess = sc.nextInt();
		attempts++;
		if(userGuess == generatedNumber) {
			System.out.println("Congratulations! you have guessed the correct number:"+ generatedNumber);
			break;
		}
		else if(userGuess<generatedNumber) {
			System.out.println("Your guess is too low. Try Again");
		}else {
			System.out.println("Your guess is too high. Try Again.");
		}
		
		if(attempts == maxAttempts) {
			System.out.println("You've run out of attempts. The correct number was: " + generatedNumber);
		}
	}
	sc.close();
	}
}
