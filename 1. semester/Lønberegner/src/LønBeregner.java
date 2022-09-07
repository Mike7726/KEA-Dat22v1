import java.util.Scanner;

public class LønBeregner {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double wagePerHour;
    double workedHoursWeek;
    double fullTimeWeek;
    double netSalary = 0;
    double grossSalary = 0;
    double grossSalaryTaxable = 0;
    double hoursOverWork;
    double overWorkFactor = 1.5;
    double laborMarketContributions;
    double laborMarketContributionsPercent = 0.08;
    double personalAllowance = 0;
    double aTax = 0;
    double k3t = 0.30;
    double k3t3 = 0.30;
    String commune;

    fullTimeWeek = 40;
    wagePerHour = 100;
    hoursOverWork = 1.5;

    System.out.print("Hours worked for this week: ");
    workedHoursWeek = in.nextDouble();
    in.nextLine();

    // Add gross for overwork
    if (workedHoursWeek > fullTimeWeek) {
      grossSalary += (workedHoursWeek - fullTimeWeek) * wagePerHour * overWorkFactor;
    }
    // Add gross for "normal work"
    grossSalary += fullTimeWeek * wagePerHour;
    System.out.printf("Your gross salary: %.2f\n", grossSalary);

    // --- Tax ---
    // Labor Market Contributions
    laborMarketContributions = grossSalary * laborMarketContributionsPercent;

    // --- A-Tax ---
    if (grossSalary >= personalAllowance) {
      grossSalaryTaxable = grossSalary - personalAllowance;
    } else {
      grossSalaryTaxable = 0;
    }

    // Income Tax

    if (grossSalary <= 30_000) {
      aTax = (0.1 + 0.1) * grossSalaryTaxable;
    } else if (grossSalary <= 100_000) {
      aTax = (0.2 + 0.2) * grossSalaryTaxable;
    } else {
      aTax = (0.3 + 0.3) * grossSalaryTaxable;
    }

  // Commune Tax
    System.out.print("Which commune do you belong to? You can choose between k1, k2 or k3: ");
  commune = in.nextLine();

    switch(commune)

  {
    case "k1" -> aTax += 0.1 * grossSalaryTaxable;
    case "k2" -> aTax += 0.2 * grossSalaryTaxable;
    case "k3" -> aTax += 0.3 * grossSalaryTaxable;
  }

  netSalary = grossSalary - (aTax +laborMarketContributions);
    System.out.printf("Your gross salary \t%f\nYour net salary \t%f",grossSalary,netSalary);

    }
}