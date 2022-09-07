package Other;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Filer_PrintStream {

  private static String fileName = "output.txt";

  public static void main(String[] args) {


    try {
      PrintStream output = new PrintStream(fileName);
      output.print("hey chris, thanks for your help");
      output.close();

      File readFile = new File(fileName);
      Scanner scanner = new Scanner(readFile);
      String s = scanner.nextLine();
      System.out.println(s);

    } catch (Exception e) {

      System.out.println(e.getMessage());

    }



  }


}
