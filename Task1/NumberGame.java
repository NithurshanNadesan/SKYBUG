package SKYBUG.Task1;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;

        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("......................................");

        while (playAgain) {
            int numberToGuess = random.nextInt(max - min + 1) + min;
            boolean guessedCorrectly = false;
            System.out.println("I'm thinking of a number between " + min + " and " + max + ". Can you guess it?");

            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (guess < numberToGuess) {
                    System.out.println("  -> Too low! Try again.");
                } else {
                    System.out.println("  -> Too high! Try again.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Your total score is " + score);
        scanner.close();
    }

}
