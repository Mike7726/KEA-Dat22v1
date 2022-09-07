import java.util.Scanner;

public class InchCalculator {
  public static void main(String[] args) {
    final double CM_PER_INCHES = 2.54;
    double inches;
    double cm;
    Scanner in = new Scanner(System.in);

    System.out.print("Type number of inches: ");
    inches = in.nextDouble();
    cm = inches * CM_PER_INCHES;
    System.out.println(inches + " inches = " + cm + " cm.");

  }

}

