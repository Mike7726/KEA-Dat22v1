import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MiniProject {
  int playerLocation;
  int enemyLocation;
  int playerStartLocation = -11;
  int enemyStartLocation = 11;

  int playerSoldierCount = 25;
  int enemySoldierCount = 25;
  int playerFirepower = 2500;
  int enemyFirepower = 2500;

  Random rnd = new Random();
  Scanner scanner = new Scanner(System.in);

  int playerdice = rnd.nextInt(2)+(1);
  int enemydice = 0 - (rnd.nextInt(2) + 1);
  int playerDiceFirepower = rnd.nextInt(6)+ (1);
  int enemyDiceFirepower = rnd.nextInt(6) + (1);

  public static void main(String[] args) {

    MiniProject demo = new MiniProject();
    demo.welcome();
    demo.startLocation();
    demo.takeTurns();

  }

  public void welcome() {
    System.out.print("Welcome to Line Battle\n");
    System.out.print("Here are the rules:\n");
    System.out.print("Hver trop starter 25 soldater og en ildkraft på 2.500.\n");
    System.out.print("");
    //Regler for spillet her


  }

  public void startLocation() {
    System.out.print("press ENTER to begin");
    scanner.nextLine();
    playerLocation = playerStartLocation;

    System.out.print("Do you want to move (f)forward, (a)attack or (b)backwards: " + "\n");

    String userInput = scanner.nextLine();

    if (userInput.equals("f")) {
      System.out.print("You have rolled: " + playerdice + "\n");
      System.out.println("\n");
      playerLocation = playerStartLocation + playerdice;
      System.out.print("Your placement on the line is now: " + playerLocation + "\n");
      System.out.println("\n");
      enemyLocation = enemyStartLocation + enemydice;
    }
    else if (userInput.equals("a")) {
      System.out.print("You have decided to attack the enemy, and you have rolled: " + playerDiceFirepower + "\n");
      playerFirepower = playerDiceFirepower * 100 - playerFirepower;
      System.out.print("You have attacked the enemy for: " + playerFirepower + "\n");

      enemyFirepower = enemyDiceFirepower * 100 - enemyFirepower;
      System.out.print("As you decided to attack, the enemy chose to do the same. \nThe enemy have attacked you for: " + enemyFirepower);

    }
    else if (userInput.equals("b")) {

    }
  }



  public void takeTurns() {
    //player && enemy slår fra 0-1, 0 == 1 felt, 1 == 2 felter
    //

  }
}
