import java.util.Scanner;

public class YouMustAnswer {
  public static void main(String[] args) {
    YouMustAnswer demo = new YouMustAnswer();
    demo.EnterName();
  }

  void EnterName() {
    Scanner scanner = new Scanner(System.in);

    String enterName;
    String passWord = "Mike2000";

    boolean isPlaying = true;

    while (isPlaying) {
      System.out.print("Enter your password: ");
      enterName = scanner.nextLine();
      if (enterName.length() == 1)
        System.out.print("Wrong, try again!\n");

      else if (enterName.equals(passWord)) {
        System.out.print("\nWelcome, Mike");
        isPlaying = false;

      }
    }
  }
}