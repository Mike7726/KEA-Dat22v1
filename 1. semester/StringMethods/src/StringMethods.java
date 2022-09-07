import java.util.Scanner;

public class StringMethods {
  public static void main(String[] args) {

    /*
    String str1;
    String str2;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Type a random word: ");
    str1 = keyboard.nextLine();
    System.out.print("Type another random word: ");
    str2 = keyboard.nextLine();
    System.out.println();

    System.out.println("First char of str1: " + str1.charAt(0));
    System.out.println("Number of chars in str1: "  + str1.length());
    System.out.println("Last char of str1: " + str1.charAt(str1.length()-1));
    System.out.println("str1 is equal to str2: " + str1.equals(str2));
    System.out.println("str1 compared to str2: " + str1.compareTo(str2));
    System.out.println("concatenation of str1 and str2: " + str1.concat(str2));
    System.out.println("str1 contains str2: " + str1.contains(str2));
    System.out.println("str1 as all-upper-case: " + str1.toUpperCase());
    System.out.println("str1 as all-lower-case: " + str1.toLowerCase());
    System.out.println("str1 without leading or trailing spaces: " + str1.trim());
    System.out.println("str1 from character number 2 and onwards: " + str1.substring(2));
    System.out.println("str1 from character number 2 to 3 (both included: " + str1.charAt(2) + str1.charAt(3));
    //System.out.println("replace str1 with str2: " + str2.concat(str2.replace(str2, str1)));
*/

    String str1;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Type in your full name: ");
    str1 = keyboard.nextLine();


    System.out.println("Full name: " + str1);
    System.out.printf("Full name: " + str1.trim());
    System.out.println("Signature: " + str1.charAt(1) + str1.substring(2));
  }
}
    /*System.out.println("Signature: " + (str1.charAt(0) + (". ") + str2));
    System.out.println("Initials of your first and last name: " + (str1.charAt(0)) + (str2.charAt(0)));
    System.out.println(str1 + "\n" + str2);
    System.out.println("Last name, first name: " + str2 + (", ") + str1);
    System.out.println("Full name in quotations marks: " + str1 + (" ") + str2);
*/