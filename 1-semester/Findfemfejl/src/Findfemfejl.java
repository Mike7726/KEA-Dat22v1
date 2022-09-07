import java.util.Random;

public class Findfemfejl {
  public static void main(String[] args) {


    //Opgave 1

    Random random = new Random();
    int randomNumber = random.nextInt(6) + 1;
    System.out.print("Your random number is: " + randomNumber);
    System.out.println();

    //Opgave 2
    int count = 0;
    System.out.print(++count);
    System.out.println();

    //Opgave 3
    int count2 = 5;
    if (count2 >= 10) {

      System.out.print("Tallet er større eller lig med 10");
      System.out.println();

      //Opgave 4
      //Opgaven er løst, det virker bare ikke når koden above også bliver kørt
      int number1 = 50;
      int number2 = 7;
      double resultat = (double) number1 / number2;
      if (resultat > 7) {
        System.out.print("Resultat større end 7");

        System.out.println();

        //Opgave 5
        //Opgaven er løst, det virker bare ikke når koden above også bliver kørt
        int number3 = 10;
        if (number3 == 10) {
          System.out.print("Variablen number indeholder værdien 10");

        }
      }
    }
  }
}

