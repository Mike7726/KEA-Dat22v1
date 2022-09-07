import java.util.Scanner;

public class RefactoringCodeExercise {
    public static void main(String[] args) {


      boolean isPlaying = true;
      while (isPlaying) {

        System.out.print("How much money do you have left: ");
        Scanner scanner = new Scanner(System.in);

      int money = scanner.nextInt();
      int bet;

      String bet2 = "How much do you want to bet?";
      String youHave = "You have $" + money + " left.";

      if (money < 100) {
        System.out.println(youHave);
        System.out.println("Your cash is too low. You cannot bet more money for now.");
      isPlaying = false;
      }
      else if (money < 500) {
        System.out.println(youHave);
        System.out.println("Cash is dangerously low. Bet carefully.\n");
        System.out.println(bet2);
        bet = scanner.nextInt();
      }
      else if (money < 1000) {
        System.out.println(youHave);
        System.out.println("Cash is somewhat low. Bet moderately.\n");
        System.out.println(bet2);
        bet = scanner.nextInt();
      }
      else {
        System.out.println(youHave);
        System.out.println("Cash is in good shape. Bet liberally.\n");
        System.out.println(bet2);
        bet = scanner.nextInt();

        }
      }
    }
  }
