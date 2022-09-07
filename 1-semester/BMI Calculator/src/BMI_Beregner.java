import java.util.Scanner;

public class BMI_Beregner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double meter = 1.78;
    int kilo = 78;
    double undervægtig = 19.5;
    double normalvægtig = 24.9;
    double moderatvægtig = 29.9;
    double fed = 39.9;

    System.out.println("BMI Beregner");
    System.out.print("Indtast din højde: ");
    meter = scanner.nextDouble();
    System.out.print("Indtast din vægt: ");
    kilo = scanner.nextInt();

    double BMI = kilo / (meter + meter);
    System.out.println("Din BMI er: " + BMI);
    if (BMI < undervægtig) {
      System.out.println("Du er undervægtig\n");
    } else if (BMI < normalvægtig) {
      System.out.println("Du er normalvægtig\n");
    } else if (BMI < moderatvægtig) {
      System.out.println("Du er moderat overvægtig\n");
    } else if (BMI < fed) {
      System.out.println("Du er meget overvægtig\n");
    } else if (BMI > fed) {
      System.out.println("Du er svært overvægtig\n");
    }
    System.out.println("Data og beregning er taget fra BMI skalaen");

  }

}
