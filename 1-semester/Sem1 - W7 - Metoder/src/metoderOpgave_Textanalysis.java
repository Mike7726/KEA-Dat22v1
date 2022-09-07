import java.util.Scanner;
import java.lang.CharSequence;

public class metoderOpgave_Textanalysis {

  String good1 = "good";
  String bad1 = "bad";
  String sunny = "sunny";
  String rainy = "rainy";
  String question1;
  String question2;
  boolean good2 = true;
  boolean bad2 = true;


  public static void main(String[] args) {


    metoderOpgave_Textanalysis demo = new metoderOpgave_Textanalysis();
    demo.userInput();
    demo.happy_sadStatements();
    demo.userOutput();

  }

  public void userInput() {
    Scanner scanner = new Scanner(System.in);
    // Ask the first question. Keywords here are good/bad
    System.out.print("Are you having a good or a bad day so far? ");
    question1 = scanner.nextLine();
    // Ask the second question. Keywords here are sunny/rainy
    System.out.print("How is the weather? Is it sunny or rainy? ");
    question2 = scanner.nextLine();

  }

  public void happy_sadStatements() {
    // Check String question1 if it contains the word "good". Boolean variable good2 = true is used below in userOutput to confirm statement
    if (question1.contains(good1)) {
      System.out.print("\nNice to know that you're having a good day so far.\n");
      good2 = true;
    } // Check String questions1 if it contains the word "bad". Boolean variable good2 = false is used below in userOutput to confirm statement
    if (question1.contains(bad1)) {
      System.out.print("\nSorry to know that you're having a bad day so far.\n");
      good2 = false;
    } //Check for sunny weather with boolean value
    if (question2.contains(sunny)) {
      bad2 = true;
    } //Check for rainy weather with boolean value
    if (question2.contains(rainy)) {
      bad2 = false;
    }
  }

  public void userOutput() {
    //You're having a good day, but it's rainy weather
    if (good2 == true && bad2 == false) {
      System.out.println("So you're having a good day, but it's rainy weather. Maybe you like rain?");
    }
    //You're having a bad day, but it's sunny weather
    if (good2 == false && bad2 == true) {
      System.out.println("So you're having a bad day, but at least it's sunny weather.");
    }
    if (good2 == true && bad2 == true) {
      System.out.println("It appears you're having a really good day.");
    }
    //You're having a bad day and it's rainy weather
    if (good2 == false && bad2 == false) {
      System.out.println("It appears you're having a really bad day.");
    }
  }
}
