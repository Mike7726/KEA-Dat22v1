import java.util.Scanner;

public class LoopAssignment {
  public static void main(String[] args) {
    LoopAssignment demo = new LoopAssignment();
    demo.user();
  }

    void user() {
    Scanner scanner = new Scanner(System.in);

    int userInput = 0;
    final int i = 99;

    boolean isPlaying = true;

    while (userInput != i) {
      System.out.print("Enter number (99 to quit): ");
      userInput = scanner.nextInt();
    }
    if (userInput == i) {
      System.out.print("\nWell done, you typed 99. Goodbye!");
      isPlaying = false;

      }
    }
  }

