import java.util.Scanner;

public class CalculatorWMethods {

  int calcUserInput1 = 0;
  int calcUserInput2 = 0;
  String MathUserInput;
  String plus = "+";
  String minus = "-";
  String times = "*";
  String divide = "/";

  public static void main(String[] args) {
    CalculatorWMethods demo = new CalculatorWMethods();
    demo.userInput();
    demo.callPlus();
    demo.callMinus();
    demo.callTimes();
    demo.callDivide();


    //The calculator will calculate everything in the calls for plus, minus, times and divide.
    // Results are put together in the calls below userInput.


    //We talked about it in class and came to an agreement that the code was looking fine -
    // but we weren't able to figure out why it was printing all results when typing in the numbers.

  }

  public void userInput() {
    System.out.print("Calculator\n");

    Scanner scanner = new Scanner(System.in);
    System.out.print("First number: ");
    calcUserInput1 = scanner.nextInt();
    System.out.print("Type plus(+), minus(-), times(*) or divide(/): " );
    MathUserInput = scanner.nextLine();
    scanner.next();
    System.out.print("Second number: ");
    calcUserInput2 = scanner.nextInt();

    if (MathUserInput.equals(plus)) {
      callPlus();
    }
    if (MathUserInput.equals(minus)) {
      callMinus();
    }
    if (MathUserInput.equals(times)) {
      callTimes();
    }
    if (MathUserInput.equals(divide)) {
      callDivide();
    }

  }

  public void callPlus() {
    System.out.print("Your result: " + (calcUserInput1 + calcUserInput2));
  }

  public void callMinus() {
    System.out.print("Your result: " + (calcUserInput1 - calcUserInput2));
  }

  public void callTimes() {
    System.out.print("Your result: " + (calcUserInput1 * calcUserInput2));
  }

  public void callDivide() {
    System.out.print("Your result: " + (calcUserInput1 / calcUserInput2));

  }

}
