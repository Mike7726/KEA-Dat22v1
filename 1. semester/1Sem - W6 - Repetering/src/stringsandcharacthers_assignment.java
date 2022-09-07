import java.util.Scanner;

public class stringsandcharacthers_assignment {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String str;

      //DET SKAL VÆRE "Mike Langtoft"
      System.out.print("user-input (Please type: Mike Langtoft): ");
      str = sc.nextLine();


      System.out.println("Full name: " + str);
      sc.nextLine();

      System.out.println("Without space: " + str.replaceAll(" ",""));
      sc.nextLine();

      System.out.println("First letter of your first name and your full last name: " + str.charAt(0)+"." + " " + str.substring(5, str.length()));
      sc.nextLine();

      System.out.println("Initials: " + str.charAt(0)+str.charAt(5));
      sc.nextLine();

      System.out.println("First name and last name above/below each other: " + "\n" + str.substring(0,4) + "\n" + str.substring(5,13));
      sc.nextLine();

      System.out.println("Last name comma first name: " + str.substring(5,13) + ", " + str.substring(0,4));
      sc.nextLine();

      System.out.println("Full name in quotations: " + '"'+ str +'"');
      sc.nextLine();

      System.out.println("Full name in apostrophe 'Mike Langtoft': " + "'"+ str +"'");
      sc.nextLine();

      System.out.println("Full name without the first and the last letter: " + str.substring(1,3));
      sc.nextLine();

      System.out.println("First and last letter in the last name: " + str.charAt(5) + str.charAt(12));
      sc.nextLine();
    }
  }

