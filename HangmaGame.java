package hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmaGame
{
	

	
	    public static void main(String[] args) 
	    {
	        
	        String[] words = {"apple", "banana", "watermelon", "orange", "graps"};
	        
	        
	        Random random = new Random();
	        String selectedWord = words[random.nextInt(words.length)];

	        
	        char[] display = new char[selectedWord.length()];
	        for (int i = 0; i < display.length; i++) 
	        {
	            display[i] = '_'; 
	        }

	        
	        ArrayList<Character> guessedLetters = new ArrayList<>();
	        int incorrectGuesses = 0;
	        final int maxIncorrectGuesses = 6; 

	        Scanner scanner = new Scanner(System.in);

	        
	        while (incorrectGuesses < maxIncorrectGuesses && !isWordGuessed(display)) 
	        {
	            
	            System.out.println("Word: " + String.valueOf(display));

	            
	            printHangman(incorrectGuesses);

	            
	            System.out.print("Enter a letter: ");
	            char guess = scanner.next().toLowerCase().charAt(0);

	            
	            if (guessedLetters.contains(guess))
	            {
	                System.out.println("You already guessed that letter.");
	                continue;
	            }

	            
	            guessedLetters.add(guess);

	            
	            if (selectedWord.contains(String.valueOf(guess))) 
	            {
	                
	                for (int i = 0; i < selectedWord.length(); i++)
	                {
	                    if (selectedWord.charAt(i) == guess)
	                    {
	                        display[i] = guess;
	                    }
	                }
	            }
	            else 
	            {
	               
	                incorrectGuesses++;
	                System.out.println("Incorrect guess.");
	            }

	            System.out.println();
	        }

	        
	        if (isWordGuessed(display))
	        {
	            System.out.println("Congratulations! You guessed the word: " + selectedWord);
	        } 
	        else
	        {
	            printHangman(incorrectGuesses);
	            System.out.println("Sorry, you lost! The word was: " + selectedWord);
	        }

	        scanner.close(); 
	    }

	    
	    public static boolean isWordGuessed(char[] display)
	    {
	        for (char c : display)
	        {
	            if (c == '_')
	            {
	                return false; 
	            }
	        }
	        return true;
	    }

	    
	    public static void printHangman(int incorrectGuesses)
	    {
	        switch (incorrectGuesses)
	        {
	            case 0:
	                System.out.println(" +---+");
	                System.out.println("     |");
	                System.out.println("     |");
	                System.out.println("     |");
	                System.out.println("    ===");
	                break;
	            case 1:
	                System.out.println(" +---+");
	                System.out.println(" O   |");
	                System.out.println("     |");
	                System.out.println("     |");
	                System.out.println("    ===");
	                break;
	            case 2:
	                System.out.println(" +---+");
	                System.out.println(" O   |");
	                System.out.println(" |   |");
	                System.out.println("     |");
	                System.out.println("    ===");
	                break;
	            case 3:
	                System.out.println(" +---+");
	                System.out.println(" O   |");
	                System.out.println("/|   |");
	                System.out.println("     |");
	                System.out.println("    ===");
	                break;
	            case 4:
	                System.out.println(" +---+");
	                System.out.println(" O   |");
	                System.out.println("/|\\  |");
	                System.out.println("     |");
	                System.out.println("    ===");
	                break;
	            case 5:
	                System.out.println(" +---+");
	                System.out.println(" O   |");
	                System.out.println("/|\\  |");
	                System.out.println("/    |");
	                System.out.println("    ===");
	                break;
	            case 6:
	                System.out.println(" +---+");
	                System.out.println(" O   |");
	                System.out.println("/|\\  |");
	                System.out.println("/ \\  |");
	                System.out.println("    ===");
	                break;
	        }
	    }
	}



