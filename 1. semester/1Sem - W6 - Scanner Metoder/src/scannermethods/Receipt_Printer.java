package scannermethods;

public class Receipt_Printer {
  public static void main(String[] args) {

    String name = "Mike Langtoft";
    String MethodOfPayment = "Dankort";
    String date = "February 7, 2022";
    String signature = "M. Langtoft";
    double amount = 23.40;
    int UniqueNum = 544;

    // The use of "|" in the string boxes is to make a box around the output
    // The percentage use in the string boxes is to move the text to the right
    System.out.println();
    System.out.printf("%15s", "CASH RECEIPT\n");
    System.out.printf("| %44s |\n", "Unique number: " + UniqueNum);
    System.out.printf("| %44s |\n", "Date: " + date);
    System.out.printf("| Name: %38s |\n", name);
    System.out.printf("| Amount: %36.2f |\n", amount);
    System.out.printf("| Method of Payment: %25s |\n", MethodOfPayment);
    System.out.printf("| %44s |\n", signature);


  }
}
