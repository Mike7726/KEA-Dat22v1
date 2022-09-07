import java.util.Scanner;


public class SwitchDemoDayAssignment {

  int number = 0;
  String text;

  public static void main(String[] args) {
    SwitchDemoDayAssignment demo = new SwitchDemoDayAssignment();
    demo.SwitchDemo();
  }

  public void SwitchDemo() {

    boolean isPlaying = true;

    while (isPlaying) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter day of week (1-7): ");
      number = scanner.nextInt();

      switch (number) {
        case 1:
          text = "Monday!\n";
          break;

        case 2:
          text = "Tuesday!\n";
          break;

        case 3:
          text = "Wednesday!\n";
          break;

        case 4:
          text = "Thursday!\n";
          break;

        case 5:
          text = "Friday!\n";
          break;

        case 6:
          text = "Saturday!\n";
          break;

        case 7:
          text = "Sunday!\n";
          break;

        default:
          text = "unknown?\n";
          isPlaying = false;
      }
      System.out.print("The day of week is " + text);

    }
  }
}

