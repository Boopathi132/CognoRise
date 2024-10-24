package demo;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomNumber = random.nextInt(100) + 1;
		int guess = 0;
		int attempts = 0;
		int maxAttempts = 5;

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I have selected a number between 1 and 100.");
		System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

		
		while (attempts < maxAttempts)
		{
			
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt(); 
			attempts++;

			
			if (guess == randomNumber)
			{
				System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
				break;
			} 
			else if (guess < randomNumber)
			{
				System.out.println("Too low! Try again.");
			}
			else
			{
				System.out.println("Too high! Try again.");
			}

			
			if (attempts == maxAttempts) 
			{
				
				System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
			}
		}

		
		scanner.close();
	}
}
