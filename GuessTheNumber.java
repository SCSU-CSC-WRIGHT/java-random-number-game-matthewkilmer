// import the necessary modules for the lab
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number! Please select a difficulty level:");
        System.out.println("Level 1: Easy (1-50)");
        System.out.println("Level 2: Medium (1-100)");
        System.out.println("Level 3: Hard (1-500)");
        System.out.println("Your Choice: ");
        int levelSelection = scanner.nextInt();
        int randomNumber = 0;
        int maxNumber = 0;

        if (levelSelection == 1) {
            maxNumber = 50;
        } else if (levelSelection == 2) {
            maxNumber = 100;
        } else if (levelSelection == 3) {
            maxNumber = 500;
        } else {
            System.out.println("You have entered an invalid level. Please try again");
        }

        randomNumber = random.nextInt(maxNumber);
        int attempts = 0;
        while (attempts < 10) {
            System.out.print("Enter a number between 1 and " + maxNumber + ": ");
            int guess = scanner.nextInt();
            attempts++;

            if (randomNumber > guess) {
                System.out.println("Sorry, your guess is too low!");
            } else if (randomNumber < guess) {
                System.out.println("Sorry, your guess is too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
            if (randomNumber == guess) {
                System.out.println("Sorry, you lose! The number was " + randomNumber);
            }
        }
    }
}