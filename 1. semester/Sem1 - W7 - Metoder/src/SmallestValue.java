import java.util.Scanner;

public class SmallestValue {

    int firstNumber = 0;
    int secondNumber = 0;
    int thirdNumber = 0;
    int result;

    public static void main(String[] args) {
      SmallestValue demo = new SmallestValue();
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
      result = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
      System.out.print("The smallest of the entered numbers are: " + result);

    }
  }
