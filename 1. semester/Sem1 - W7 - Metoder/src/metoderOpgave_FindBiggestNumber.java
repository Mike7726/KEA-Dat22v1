import java.util.Scanner;
import java.lang.Math;

public class metoderOpgave_FindBiggestNumber {

  // Variables = 0 for the user to input whatever placed above static void
  int result = 0;
  int result2 = 0;
  int tal1;
  int tal2;

  public static void main(String[] args) {


    //Sections in the program listed in static void
    metoderOpgave_FindBiggestNumber demo = new metoderOpgave_FindBiggestNumber();
    demo.getUserInput();
    demo.findLargestNumber();
    demo.displayLargestNumber();

  }

  public void getUserInput() {

    // Userinput
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type in a number: ");
    tal1 = scanner.nextInt();
    System.out.print("Type in another number: ");
    tal2 = scanner.nextInt();

  }
  public void findLargestNumber() {

    //Math.max will find the biggest number and Math.min will find the smallest of the two variables
    result = Math.max(tal1, tal2);
    result2 = Math.min(tal1, tal2);

  }
public void displayLargestNumber() {

    //Output with result and result2
  System.out.print("\nThe biggest number of the two numbers you have typed in is: " + result);
  System.out.print("\nAnd the smallest number is: " + result2);

  }
}
