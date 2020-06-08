package project2;

// loads in the library with the code to generate random numbers
import java.util.Random; 
import java.util.Scanner;

public class GuessingGame {

public static void main(String[] args) {
    
    Random rand = new Random();
    int numberToGuess = rand.nextInt(100);
    int numberOfTries = 0;
    Scanner input = new Scanner(System.in);
    int guess;
    int lowGuess = 0;
    int highGuess = 0;
    boolean win = false;
    
        System.out.println("Guess a number between 1 and 100");
        System.out.println("Type -1 if you give up and wish to stop");
    
    while (win == false)
    {
        guess = input.nextInt();
        numberOfTries++;
        
        if (guess == numberToGuess)
        {
            win = true;
                System.out.println("Correct!");
                System.out.println("The number was " + numberToGuess);
                System.out.println("This took you a total of " + numberOfTries + " attempts");
                System.out.println( lowGuess + " times you guessed to low ");
                System.out.println( highGuess + " times you guessed to high ");
        }
        
        else if (guess == -1)
        {
            System.out.println("You lose!");
            break;
        }

        else if (guess < numberToGuess)
        {
             System.out.println("Your guess is too low");
             lowGuess++;
        }
        
        else if (guess > numberToGuess)
        {
             System.out.println("Your guess is too high");
             highGuess++;
        }
        
        else 
        {
            System.out.println("That is not a valid answer. Try again");
        }
           
    }

    }
}