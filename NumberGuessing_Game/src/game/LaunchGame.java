package game;
import java.util.Random;
import java.util.Scanner;

public class LaunchGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = r.nextInt(100)+1;
		
		int guessCount=0;
		
		
		
			System.out.println("Welcome to number guessing game");
			
			System.out.println("Guess a number between 1 to 100");
			
			
		while(true)
		{
			System.out.println("Enter your guess : ");
			
			int guess = scanner.nextInt();
			guessCount++;
			
			if(guess == randomNumber)
			{
				System.out.println("Correct! You Win!");
				System.out.println("It took you "+guessCount+"tries");
				
				break;
			}
			else if(guess>randomNumber)
			{
				System.out.println("Nope! The Number is Lower , Guess again");
			}
			else
			{
				System.out.println("Nope! The Number is Higher , Guess again");
			}
		}
		scanner.close();
	}

}
