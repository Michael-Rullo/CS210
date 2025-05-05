import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static int randInt = random.nextInt(1, 11);
    static int userGuess = 0;

    public static void main(String[] args) {
        
        System.out.println("Welcome to 'Guess the Number'!");
        System.out.println("I'm thinking of a number between 1 and 10");
        System.out.println();

        while (userGuess != randInt) {
            
            try {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    throw new IllegalArgumentException("Please guess a number between 1 and 10");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Error: That's not a valid number. Please enter an integer");
                scanner.nextLine();
                userGuess = 0;
            } catch (IllegalArgumentException iae) {
                System.out.println("Error: " + iae.getMessage());
                userGuess = 0;
            }

            if (userGuess != randInt) {
                System.out.println("Try again!");
            } else {
                System.out.println("Congrats! You guessed right");
            }
            System.out.println();
        }
    }
}
