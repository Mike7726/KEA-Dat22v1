package scannermethods;

import java.util.Scanner;

public class ScannerMethods {
  public static void main(String[] args) {
    String name;
    int yearOfBirth;
    double bmi;
    boolean hasDriverLicense;
    char gender;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter name: ");
    name = keyboard.nextLine();
    System.out.print("Enter year of birth: ");
    yearOfBirth = keyboard.nextInt();
    System.out.print("Enter BMI: ");
    bmi = keyboard.nextDouble();
    System.out.print("Enter driver's license (true/false): ");
    hasDriverLicense = keyboard.nextBoolean();
    System.out.print("Enter gender: ");
    keyboard.nextLine();
    gender = keyboard.nextLine().charAt(0);

    System.out.println();
    System.out.println("Name: " + name);
    System.out.println("Year of birth: " + yearOfBirth);
    System.out.println("BMI: " + bmi);
    System.out.println("Has driver's license: " + hasDriverLicense);
    System.out.println("Gender: " + gender);

  }
}
