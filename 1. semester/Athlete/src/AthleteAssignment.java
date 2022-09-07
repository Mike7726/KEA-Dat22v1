import java.util.Scanner;

public class AthleteAssignment {
  public static void main(String[] args) {

    boolean running = true;
    while (running) {

      String userInput = "y";
      String name;
      double time;
      int seconds;
      int milliseconds;
      int meters;
      int centimeters;
      double distance;
      final double round = 0.5;

      System.out.print("Please enter your name: ");
      Scanner keyboard = new Scanner(System.in);
      name = keyboard.nextLine();

      System.out.print("Enter total number of seconds (as a double): ");
      time = keyboard.nextDouble();
      keyboard.nextLine();
      milliseconds = (int) (time % 1.0 * 1000 + round);
      seconds = (int) time;

      System.out.print("Enter total number of meters (as a double): ");
      distance = keyboard.nextDouble();
      keyboard.nextLine();
      centimeters = (int) (distance % 1.0 * 100 + round);
      meters = (int) distance;

      System.out.printf("\nStats of %s\n", name);
      System.out.printf("Time: %s seconds and %d milliseconds\n", seconds, milliseconds);
      System.out.printf("Distance: %d meters and %d centimeters\n", meters, seconds);

      System.out.println("\nType y (Yes) to return\n");
      userInput = keyboard.next();
      if (!userInput.equals("y"))
        running = false;

    }
  }
}
