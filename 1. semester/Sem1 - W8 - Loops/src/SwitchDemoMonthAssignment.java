import java.util.Scanner;


public class SwitchDemoMonthAssignment {

  int number = 0;
  String text;
  String text2;

  public static void main(String[] args) {
    SwitchDemoMonthAssignment demo = new SwitchDemoMonthAssignment();
    demo.SwitchDemo();
  }

  public void SwitchDemo() {

    boolean isPlaying = true;

    while (isPlaying) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("\nEnter which month you wish to know the amount of days in (1-12): ");
      number = scanner.nextInt();

      switch (number) {
        case 1:
          text = "January ";
          text2 = "31 days\n";
          break;
        case 3:
          text = "March ";
          text2 = "31 days\n";
          break;
        case 5:
          text = "May ";
          text2 = "31 days\n";
          break;
        case 7:
          text = "July ";
          text2 = "31 days\n";
          break;
        case 8:
          text = "August ";
          text2 = "31 days\n";
          break;
        case 10:
          text = "October ";
          text2 = "31 days\n";
          break;
        case 12:
          text = "December ";
          text2 = "31 days\n";
          break;

        case 4:
          text = "April ";
          text2 = "30 days\n";
          break;
        case 6:
          text = "June ";
          text2 = "30 days\n";
          break;
        case 9:
          text = "September ";
          text2 = "30 days\n";
          break;
        case 11:
          text = "November ";
          text2 = "30 days\n";
          break;

        case 2:
          text = "February ";
          text2 = "28 days - unless it's leap year, then it will be 29 days\n";
          break;

        default:
          text = "Month is ";
          text2 = "unknown?\n";
          isPlaying = false;
      }
      System.out.printf("%s" + "%s", text, text2);

    }
  }
}

