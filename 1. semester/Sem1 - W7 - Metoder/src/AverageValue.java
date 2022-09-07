import java.util.Scanner;

public class AverageValue {

  int firstNumber = 0;
  int secondNumber = 0;
  int thirdNumber = 0;

  public static void main(String[] args) {
    AverageValue demo = new AverageValue();

    demo.userInput();
    demo.userOutput();

  }

  public void userInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("First number: ");
    firstNumber = scanner.nextInt();
    System.out.print("Second number: ");
    secondNumber = scanner.nextInt();
    System.out.print("Third number: ");
    thirdNumber = scanner.nextInt();

  }

  public void userOutput() {
    System.out.print("The average of the entered numbers are: " + avr(firstNumber, secondNumber, thirdNumber));

  }

  public double avr(double a, double b, double c) {
    return(a + b + c) / 3;
  }
}
