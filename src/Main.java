import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        Random rnd = new Random();

        boolean isGameRunning = true;

        while (isGameRunning) {
            int score = 0;
            int lives = 3;


            while (isGameRunning && lives > 0) {

                // Setting two random number variables
                int randomNumber = rnd.nextInt(10);
                int randomNumber2 = rnd.nextInt(10);

                // Asking user the question
                System.out.println("What is " + randomNumber + " + " + randomNumber2 + "?");
                int calculatedAnswer = randomNumber + randomNumber2;
                // Storing guess for user
                System.out.print("Enter your guess: ");
                int userGuess = stdin.nextInt();

                if (userGuess == calculatedAnswer) {
                    score++;
                    System.out.println("Congratulations! You guessed correctly!\n The score is: " + score);
                    break;

                } else {
                    lives--;

                    if (lives > 0) {
                        System.out.println("You have " + lives + " lives left!");
                    } else {
                        System.out.println("Your total score is: " + score);
                        System.out.println("--------------Game over! You have " + lives + " lives left--------------");

                    }
                }


            }


            System.out.print("Would you like to play again? (y/n)");
            String playAgain = stdin.next();
            if (playAgain.equalsIgnoreCase("y")) {
                isGameRunning = true;
            } else {
                isGameRunning = false;
                System.out.println("Thanks for playing! :)");
            }
        }
    }}