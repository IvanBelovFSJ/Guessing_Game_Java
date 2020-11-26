import java.util.Scanner;
import java.util.Random;
/* I have imported only needed packages / classes
 * required for the execution of this program.

/* 
 * Assignment_11_GuessingGame_Modification.java is written
 *
 * with the purpose of understanding
 * and practicing different loop scenarios.
 * In this example we observe an if - else loop
 * 
 * This Java program will pick a random number from 1 to 10,
 * a user has to guess a number picked by a program.
 *
 * Algorithm for this code was found on the dedicated
 * leap year wiki page.
 *
 * Author: Ivan Belov
 */

public class GuessingGame	{

	private final static int ONE = 1;
	
 public static void main (String[] args)	{

  final int RANGEVAL = 10; // Initializing the number limit to : 1 to 10
  int computerSelection = 0;
  int mySelection = 0;
  byte guessCount = 0;
  String nextGame = "";

  @SuppressWarnings("resource")
  Scanner myGuessScanner = new Scanner (System.in); // Creating an instance of a scanner object
  Random numberGenerator = new Random(); // Creating an instance of a random object
  
  String welcomeMessage = " \n \t Hello and Welcome to the Guessing Game! ";
  String correctGuess = " \n \t You guessed correctly. Computer also selected : " + mySelection + ".";
  String wrongGuess = " \n \t You guessed wrong. Computer selected : " + computerSelection + ".";
  String instructions = " \n \t Enter a number 1 to 10 to see if a program picked the same number: ";
  String outOfRange = " \n \t Number selected is out of range. Enter a number again. ";
  String playAgain = " \n \t Another round? ( y / n ) : ";
  String endOfGame = " \n \t End of the game. ";
  String closingApp = " \n \t Shutting Down. ";
  
  System.out.print(welcomeMessage);
  
  while(true)	{
	  
	  System.out.print(instructions);
	  computerSelection = numberGenerator.nextInt(RANGEVAL) + 1;
	  mySelection = myGuessScanner.nextInt();
	  
	  if ( mySelection < 0 || mySelection > 10 )	{
		  System.out.print(outOfRange);
		  mySelection = myGuessScanner.nextInt();	}
	  
	  else if ( mySelection == computerSelection )	{
		  System.out.print(correctGuess);	}
	  
	  else	{
		  System.out.print(wrongGuess);	}
	  
	  guessCount++;
	  System.out.println(" \n \t You have played : " + guessCount + " game(s).");
	 
	  System.out.print(playAgain);
	  nextGame = myGuessScanner.next();
	  
	  if (Character.toLowerCase(nextGame.charAt(0)) == 'n')	{
		  System.out.print(endOfGame + closingApp);
		  Runtime.getRuntime().exit(1);
	  }	/* End of if (Character.toLowerCase(nextGame.charAt(0)) == 'n')	*/
	  
	  }	/* End of while (true) */	}	/* End of main	*/	}	// End of class