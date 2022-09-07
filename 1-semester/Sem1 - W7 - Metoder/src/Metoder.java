import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Random;

public class Metoder {
  public static void main(String[] args) {

    Metoder demo = new Metoder();
    demo.name1();
    demo.age1();
    demo.time1();

  }
    public void name1() {

      String yourName;
      System.out.print("Type your name here: ");
      Scanner scanner = new Scanner(System.in);
      yourName = scanner.nextLine();

      System.out.println("Hello, " + yourName + "\n");

    }
  public void age1(){

    int yourAge = 0;
    int requiredAge = 0;
    System.out.print("Type your age here: ");
    Scanner scanner = new Scanner(System.in);
    yourAge = scanner.nextInt();

    if (yourAge >= 18) {
      System.out.println("You are old enough to drink alcohol");
    }
    if (yourAge < 18) {
      System.out.println("You are not old enough to drink alcohol\n");
      //TODO få programmet til at regne ud+printe til bruger hvor mange år -
      // der skal til for at kunne drikke, hvis brugeren ikke er gammel nok. evt. brug variabel requiredAge
   } //else if (yourAge){
     //   System.out.println("You can drink in two years");
     // }

     // System.out.println("You can drink alcohol in " + requiredAge);

      }
  public void time1() {
    LocalDate today = LocalDate.now();
    LocalTime today2 = LocalTime.now();
    System.out.println("\nThe date today: " + today);
    System.out.println("Local time: " + today2);

    }
  }