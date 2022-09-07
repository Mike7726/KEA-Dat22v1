import java.util.Scanner;
import java.util.Random;

// Fully works (re-checked)

public class GuessingGame {

  public static void main(String[] args) {

    int userInput = 0;
    int number = 0;

    System.out.print("Welcome to the Guessing Game\n");

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    boolean running = true;

      while (running) {
        System.out.print("Choose a number between 1 and 10: ");
        userInput = scanner.nextInt();

        number = rand.nextInt(10) + 1;

        if (number == userInput) {
          System.out.println("Well done. You guess was absolutely correct!");
         running = false;

        } else {
          System.out.print("Try again!\n");
          System.out.printf("The number was: %d \n", number);


        }
      }
    }
  }


