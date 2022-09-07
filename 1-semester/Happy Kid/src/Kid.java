import java.time.LocalDate;

public class Kid {
  String name;
  int age;

  Kid(String input, int yearOfBirth) {
   name = input;
   age = LocalDate.now().getYear() - yearOfBirth;
  }
  public void KidNameAge() {
    System.out.printf("Kid's name & age: %s (%d)", name, age);
    System.out.println();
  }
}
