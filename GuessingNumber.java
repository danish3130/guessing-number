import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "Yes";

        // While loop to determind if we are going to play the play again
        while (play.equals("Yes")) {
            Random input = new Random();
            int Num = input.nextInt(100);
            int guess = -1;
            int tries = 0;

            // While Loop to check if the game is over
            while (guess != Num) { // a!=b or a=a!b
                System.out.print("Guess a number between 1-100 :");
                guess = sc.nextInt();
                tries++;

                if (guess == Num) {
                    System.out.println("Awesome! You guessed the number.");
                    System.out.println("It only took you " + tries + " guesses.");
                    System.out.println("Would you like to play again? Yes or No ");
                    play = sc.next().toLowerCase();
                } else if (guess > Num) {
                    System.out.println("Your guess is too High, try again.");
                } else {
                    System.out.println("Your guess is too Low, try again");
                }
            }
        }
    }
}