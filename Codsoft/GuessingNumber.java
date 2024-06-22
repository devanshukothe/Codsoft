import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxAttempts = 10;
        int totalRounds = 0;
        int totalScore = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("WELCOME TO GUESSING GAME :)");
            System.out.println("I have selected a number between 1 and 100. You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    System.out.println("You guessed it in " + attempts + " attempts.");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all " + maxAttempts + " attempts. The correct number was " + targetNumber + ".");
            }
            
            totalRounds++;
            totalScore += maxAttempts - attempts;

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Game Over!");
        System.out.println("You played " + totalRounds + " rounds.");
        System.out.println("Your total score is " + totalScore + " points.");
        
        scanner.close();
    }
}
