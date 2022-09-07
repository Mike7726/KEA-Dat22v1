import java.util.Scanner;

public class CalculateSeconds {
  public static void main(String[] args) {

    boolean running = true;
    while (running) {

      String userInput = "y";
      int seconds;
      int sec;
      int hour;
      int minute;
      System.out.print("Enter total number of seconds: ");
      Scanner in = new Scanner(System.in);
      seconds = in.nextInt();
      if (seconds < +0) {
        seconds = seconds + -1;
      }
      sec = seconds % 60;
      hour = seconds / 60;
      minute = hour % 60;
      hour = hour / 60;

      System.out.printf("%d seconds = %d hours, %d minutes and %d seconds", seconds, hour, minute, sec);
      System.out.println("\n");

      System.out.println("\nType y (Yes) to return\n");
      userInput = in.next();
      if (!userInput.equals("y"))
        running = false;

      }
    }
  }
