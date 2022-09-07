import java.util.Scanner;

public class LoopAssignment2 {
  public static void main(String[] args) {
    LoopAssignment2 demo = new LoopAssignment2();
    demo.user();
  }

  void user() {
    Scanner scanner = new Scanner(System.in);

    String userInput = "";
    final int i = 99;
    String alternative = "quit";

    boolean isPlaying = true;

    while (isPlaying) {

      if (!userInput.equals("99")) {
        System.out.print("Enter number (99 to quit): ");
        userInput = scanner.nextLine();
      }
      if (userInput.equals("99")) {
        System.out.print("\nWell done, you typed 99. Goodbye!");
        isPlaying = false;
      } else if (userInput.toLowerCase().equals(alternative)) {
        System.out.print("You have successfully quit");
        isPlaying = false;
      }
    }
  }
}